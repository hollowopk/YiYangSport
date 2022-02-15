package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.model.Navigation;
import cn.stylefeng.guns.modular.system.service.INavigationService;
import cn.stylefeng.guns.modular.system.service.IRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@Controller
@RestController
@RequestMapping("/nav")
public class NavigationController {

    @Autowired
    private INavigationService service;

    @RequestMapping("")
    public Msg findBySort(@RequestParam(value = "sort") int sort) {
        List<Navigation> navigation = service.findBySort(sort);
        return Msg.success().add("result", navigation);
    }

}
