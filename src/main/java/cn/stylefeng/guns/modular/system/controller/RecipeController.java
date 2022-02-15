package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.modular.system.model.Food;
import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.model.Recipe;
import cn.stylefeng.guns.modular.system.service.IRecipeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2022-01-28
 */

@CrossOrigin
@Controller
@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private IRecipeService recipeService;

    @RequestMapping("")
    public Msg findAll() {
        List<Recipe> recipes = recipeService.findAll();
        return Msg.success().add("pageInfo", recipes);
    }

    @RequestMapping("/{name}")
    public Msg findByName(@PathVariable String name) {
        List<Recipe> recipes = recipeService.findByName(name);
        return Msg.success().add("pageInfo", recipes);
    }

    @RequestMapping("/method/{method}")
    public Msg findByMethod(@PathVariable String method) {
        List<Recipe> recipes = recipeService.findByMethod(method);
        return Msg.success().add("pageInfo", recipes);
    }

    @RequestMapping("/taste/{taste}")
    public Msg findByTaste(@PathVariable String taste) {
        List<Recipe> recipes = recipeService.findByTaste(taste);
        return Msg.success().add("pageInfo", recipes);
    }

}
