package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.model.Recipe;
import cn.stylefeng.guns.modular.system.model.Sport;
import cn.stylefeng.guns.modular.system.service.IRecipeService;
import cn.stylefeng.guns.modular.system.service.ISportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2022-01-31
 */

@CrossOrigin
@RestController
@RequestMapping("/sport")
public class SportController {

    @Autowired
    private ISportService service;

    @RequestMapping("/all")
    public Msg findAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                       @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize) {
        PageHelper.startPage(pn, pageSize);
        List<Sport> sports = service.findAll();
        PageInfo page = new PageInfo(sports, (sports.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping("/name/{name}")
    public Msg findByName(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                          @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize,
                          @PathVariable String name) {
        PageHelper.startPage(pn, pageSize);
        List<Sport> sports = service.findByName(name);
        PageInfo page = new PageInfo(sports, (sports.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping("/category/{category}")
    public Msg findByCategory(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                          @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize,
                          @PathVariable String category) {
        PageHelper.startPage(pn, pageSize);
        List<Sport> sports = service.findByCategory(category);
        PageInfo page = new PageInfo(sports, (sports.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
    }

}
