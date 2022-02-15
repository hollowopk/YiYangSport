package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.modular.system.model.Cart;
import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.service.IUserCartService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin
@Controller
@RestController
@RequestMapping("/userCart")
public class UserCartController extends BaseController {
    @Autowired
    private IUserCartService userCartService;

    @ResponseBody
    @RequestMapping("/showCollect")
    public Msg showCollect(){
        Integer userId = ShiroKit.getUser().getId();
        List<Cart> list = userCartService.findCollect(userId);
        return Msg.success().add("list",list);
    }
    @ResponseBody
    @RequestMapping("/showCart")
    public Msg showCart(){
        Integer userId = ShiroKit.getUser().getId();
        List<Cart> list = userCartService.findCart(userId);
        return Msg.success().add("list",list);
    }
    @ResponseBody
    @RequestMapping("/collectOperation/{goodid}/{collect}")
    public Msg collectOperation(@PathVariable int goodid,@PathVariable int collect){
        Integer userId = ShiroKit.getUser().getId();
        if(collect==1){
        Cart cart = userCartService.findifnull(goodid, userId);
        if(cart==null){
            userCartService.insert(goodid,userId,collect,0);
            return Msg.success();
            }
        }
        userCartService.updateCollect(goodid,userId,collect);
        return Msg.success();
    }
    @ResponseBody
    @RequestMapping("/cartOperation/{goodid}/{cart}")
    public Msg cartOperation(@PathVariable int goodid,@PathVariable int cart){
        Integer userId = ShiroKit.getUser().getId();
        if(cart!=0){
            Cart cart2 = userCartService.findifnull(goodid, userId);
            if(cart2==null){
                userCartService.insert(goodid,userId,0,cart);
                return Msg.success();
            }
        }
        userCartService.updateCart(goodid,userId,cart);
        return Msg.success();
    }
}
