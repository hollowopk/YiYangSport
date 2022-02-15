package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.core.log.LogObjectHolder;
import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.model.UserRecord;
import cn.stylefeng.guns.modular.system.service.IUserRecordService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * 用户记录控制器
 *
 * @author fengshuonan
 * @Date 2022-01-18 12:18:52
 */
@CrossOrigin
@Controller
@RestController
@RequestMapping("/userRecord")
public class UserRecordController extends BaseController {


    @Autowired
    private IUserRecordService userRecordService;

    @ResponseBody
    @RequestMapping("/commit/{height}/{weight}/{Calorie}/{drink}/{steps}")
    public Msg commitRecord(@PathVariable int height,@PathVariable int weight,@PathVariable int Calorie,@PathVariable int drink,@PathVariable int steps){
        Integer userId = ShiroKit.getUser().getId();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
        String date = sdf.format(new Date());
        userRecordService.inserRecord(userId, date, height, weight, Calorie, drink, steps);
        return Msg.success();
    }
    @ResponseBody
    @RequestMapping("/getdata/{timeDiff}")
    public Msg getRecord(@PathVariable int timeDiff){
        Integer userId = ShiroKit.getUser().getId();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd" );
        String beginTime = sdf.format(new Date(new Date().getTime() - timeDiff * 24 * 60 * 60 * 1000L));
        String endTime = sdf.format(new Date());
        List<UserRecord> record = userRecordService.findRecentRecord(userId, beginTime, endTime);
        return Msg.success().add("record",record);
    }

}
