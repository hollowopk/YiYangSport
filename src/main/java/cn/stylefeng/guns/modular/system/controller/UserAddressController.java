package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.modular.system.model.Address;
import cn.stylefeng.guns.modular.system.model.Cart;
import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.service.IUserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RestController
@RequestMapping("/userAddress")
public class UserAddressController {
    @Autowired
    private IUserAddressService userAddressService;
    @ResponseBody
    @RequestMapping("")
    public Msg findAll(){
        Integer userId = ShiroKit.getUser().getId();
        List<Address> list = userAddressService.findAll(userId);
        return Msg.success().add("list",list);
    }
    @ResponseBody
    @RequestMapping("/addAddress/{name}/{phone}/{address}/{code}")
    public Msg addAddress(@PathVariable String name,@PathVariable String phone,@PathVariable String address,@PathVariable String code){
        Integer userId = ShiroKit.getUser().getId();
        userAddressService.addAddress(userId,name,phone,address,code);
        return Msg.success();
    }
    @ResponseBody
    @RequestMapping("/updateAddress/{id}/{name}/{phone}/{address}/{code}")
    public Msg updateAddress(@PathVariable Integer id,@PathVariable String name,@PathVariable String phone,@PathVariable String address,@PathVariable String code){
        userAddressService.updateAddress(id, name, phone, address, code);
        return Msg.success();
    }
    @ResponseBody
    @RequestMapping("/deleteAddress/{id}")
    public Msg deleteAddress(@PathVariable Integer id){
        userAddressService.deleteAddress(id);
        return Msg.success();
    }


}
