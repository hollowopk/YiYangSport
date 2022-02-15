/**
 * Copyright 2018-2020 stylefeng & fengshuonan (https://gitee.com/stylefeng)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.core.common.annotion.BussinessLog;
import cn.stylefeng.guns.core.common.annotion.Permission;
import cn.stylefeng.guns.core.common.constant.Const;
import cn.stylefeng.guns.core.common.constant.dictmap.UserDict;
import cn.stylefeng.guns.core.common.constant.state.ManagerStatus;
import cn.stylefeng.guns.core.common.exception.BizExceptionEnum;
import cn.stylefeng.guns.core.common.exception.InvalidKaptchaException;
import cn.stylefeng.guns.core.common.node.MenuNode;
import cn.stylefeng.guns.core.log.LogManager;
import cn.stylefeng.guns.core.log.factory.LogTaskFactory;
import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.core.shiro.ShiroUser;
import cn.stylefeng.guns.core.util.ApiMenuFilter;
import cn.stylefeng.guns.core.util.KaptchaUtil;
import cn.stylefeng.guns.modular.system.factory.UserFactory;
import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.model.User;
import cn.stylefeng.guns.modular.system.service.IMenuService;
import cn.stylefeng.guns.modular.system.service.IUserService;
import cn.stylefeng.guns.modular.system.transfer.UserDto;
import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import cn.stylefeng.roses.core.util.ToolUtil;
import cn.stylefeng.roses.kernel.model.exception.ServiceException;
import com.google.code.kaptcha.Constants;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static cn.stylefeng.roses.core.util.HttpContext.getIp;

/**
 * 登录控制器
 *
 * @author fengshuonan
 * @Date 2017年1月10日 下午8:25:24
 */
@CrossOrigin
@Controller
public class LoginController extends BaseController {

    @Autowired
    private IMenuService menuService;

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        //获取菜单列表
        List<Integer> roleList = ShiroKit.getUser().getRoleList();
        if (roleList == null || roleList.size() == 0) {
            ShiroKit.getSubject().logout();
            model.addAttribute("tips", "该用户没有角色，无法登陆");
            return "/login.html";
        }
//        List<MenuNode> menus = menuService.getMenusByRoleIds(roleList);
//        List<MenuNode> titles = MenuNode.buildTitle(menus);
//        titles = ApiMenuFilter.build(titles);
//
//        model.addAttribute("titles", titles);
//
//        //获取用户头像
//        Integer id = ShiroKit.getUser().getId();
//        User user = userService.selectById(id);
//        String avatar = user.getAvatar();
//        model.addAttribute("avatar", avatar);

        return "/success.html";
    }

    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        if (ShiroKit.isAuthenticated() || ShiroKit.getUser() != null) {
            return REDIRECT + "/";
        } else {
            return "/login.html";
        }
    }

    /**
     * 点击登录执行的动作
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Msg loginVali() {

        String username = super.getPara("username").trim();
        String password = super.getPara("password").trim();
        String remember = super.getPara("remember");

        //验证验证码是否正确
        if (KaptchaUtil.getKaptchaOnOff()) {
            String kaptcha = super.getPara("kaptcha").trim();
            String code = (String) super.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
            if (ToolUtil.isEmpty(kaptcha) || !kaptcha.equalsIgnoreCase(code)) {
                throw new InvalidKaptchaException();
            }
        }

        Subject currentUser = ShiroKit.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password.toCharArray());

        if ("on".equals(remember)) {
            token.setRememberMe(true);
        } else {
            token.setRememberMe(false);
        }

        currentUser.login(token);

        ShiroUser shiroUser = ShiroKit.getUser();
        super.getSession().setAttribute("shiroUser", shiroUser);
        super.getSession().setAttribute("username", shiroUser.getAccount());

        LogManager.me().executeLog(LogTaskFactory.loginLog(shiroUser.getId(), getIp()));

        ShiroKit.getSession().setAttribute("sessionFlag", true);

        User user = userService.getByAccount(username);
        return Msg.success().add("user", user);
    }

    /**
     * 退出登录
     */
    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public Msg logOut() {
        LogManager.me().executeLog(LogTaskFactory.exitLog(ShiroKit.getUser().getId(), getIp()));
        ShiroKit.getSubject().logout();
        deleteAllCookie();
        return Msg.success().add("statue", "logout");
    }

    /**
     * 注册
     * 用户名
     * 密码
     */
    @RequestMapping("/regist/{account}/{password}")
    @ResponseBody
    public Msg add(@PathVariable String account, @PathVariable String password) {
        UserDto user = new UserDto();
        user.setAccount(account);
        user.setPassword(password);
        // 判断账号是否重复
        User theUser = userService.getByAccount(user.getAccount());
        if (theUser != null) {
            return Msg.fail().add("fail", "该用户已存在");
        }

        // 完善账号信息
        user.setSalt(ShiroKit.getRandomSalt(5));
//        user.setSalt("0ph0v");
        user.setPassword(ShiroKit.md5(user.getPassword(), user.getSalt()));
        user.setStatus(ManagerStatus.OK.getCode());
        user.setRoleid("1");
        user.setCreatetime(new Date());
        this.userService.insert(UserFactory.createUser(user));
        return Msg.success().add("user", user);
    }

    /**
     * 修改当前用户的密码
     */
    @RequestMapping("/changePwd/{oldPwd}/{newPwd}")
    @ResponseBody
    public Msg changePwd(@PathVariable String oldPwd, @PathVariable String newPwd) {
        if (newPwd.equals(oldPwd)) {
            return Msg.fail().add("fail", "密码必须为新!!!");
        }
        Integer userId = ShiroKit.getUser().getId();
        User user = userService.selectById(userId);
        String oldMd5 = ShiroKit.md5(oldPwd, user.getSalt());
        if (user.getPassword().equals(oldMd5)) {
            String newMd5 = ShiroKit.md5(newPwd, user.getSalt());
            user.setPassword(newMd5);
            user.updateById();
            return Msg.success().add("user", user);
        } else {
            return Msg.fail().add("fail", "输入的原密码不正确");
        }
    }

    /**
     * 修改当前用户的其他信息
     */
    @RequestMapping("/changeData/{avatar}/{name}/{birthday}/{sex}/{email}/{phone}/{age}")
    @ResponseBody
    public Msg changePwd(@PathVariable String avatar, @PathVariable String name, @PathVariable String birthday, @PathVariable Integer sex, @PathVariable String email, @PathVariable String phone,@PathVariable Integer age) {

        Integer userId = ShiroKit.getUser().getId();
        User user = userService.selectById(userId);
        if (avatar != null) {
            avatar = converturl(avatar);
            user.setAvatar(avatar);
        }
        if (name != null) {
            user.setName(name);
        }
        if (birthday != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date parse = sdf.parse(birthday);
                user.setBirthday(parse);
            } catch (ParseException e) {
                return Msg.fail().add("fail", "日期不符合格式");
            }
        }
        user.setSex(sex);
        if (email != null) {
            user.setEmail(email);
        }
        if (phone != null) {
            user.setPhone(phone);
        }
        user.setVersion(age);
        user.updateById();
        return Msg.success().add("user", user);
    }

    private String converturl(String avatar) {
        avatar = avatar.replaceAll("%25", "%").replaceAll("%26", "&")
                .replaceAll("%2C", ",").replaceAll("%2F", "/")
                .replaceAll("%3A", ":").replaceAll("%3D", "=")
                .replaceAll("%3F", "?");
        return avatar;
    }
}
