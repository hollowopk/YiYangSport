package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.guns.modular.system.model.Food;
import cn.stylefeng.guns.modular.system.model.Msg;
import cn.stylefeng.guns.modular.system.service.IFoodService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 食谱管理控制器
 *
 * @author fengshuonan
 * @Date 2022-01-17 11:46:31
 */
@CrossOrigin
@Controller
@RestController
@RequestMapping("/food")
public class FoodController extends BaseController {


    @Autowired
    private IFoodService foodService;


    @RequestMapping("")
    public Msg findAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                       @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize) {
        // 这不是一个分页查询
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pn, pageSize);
        List<Food> foods=foodService.findAll();
        // startPage后面紧跟的这个查询就是一个分页查询
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(foods, (foods.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping("/{category}")
    public Msg showcategory(@PathVariable String category,@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                            @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize) {
        PageHelper.startPage(pn, pageSize);
        List<Food> list = foodService.findByCategory(category);
        PageInfo page = new PageInfo(list, (list.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
//        return Msg.success().add("result", list);

    }
    @RequestMapping("/name/{name}")
    public Msg showByname(@PathVariable String name,@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                            @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize) {
        PageHelper.startPage(pn, pageSize);
        List<Food> list = foodService.findByName(name);
        PageInfo page = new PageInfo(list, (list.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
//        return Msg.success().add("result", list);

    }

    @RequestMapping("/asc/{select}")
    public Msg showasc(@PathVariable String select,@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                       @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize) {
        PageHelper.startPage(pn, pageSize);
        List<Food> list = foodService.findByAsc(select);
        PageInfo page = new PageInfo(list, (list.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
//        return Msg.success().add("result", list);
    }
    @RequestMapping("/desc/{select}")
    public Msg showdesc(@PathVariable String select,@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                        @RequestParam(value = "pageSize", defaultValue = "30") Integer pageSize)  {
        PageHelper.startPage(pn, pageSize);
        List<Food> list = foodService.findByDesc(select);
        PageInfo page = new PageInfo(list, (list.size()/pageSize)+1);
        return Msg.success().add("pageInfo", page);
//        return Msg.success().add("result", list);
    }

//    private void sortbyasc(String select) {
//        try {
//            Class<?> foodclazz = Food.class;
//            Field field = foodclazz.getDeclaredField(select);
//            field.setAccessible(true);
//            foods.sort((o1, o2) -> {
//                try {
//                    BigDecimal subtract = ((BigDecimal) field.get(o1)).subtract((BigDecimal) field.get(o2));
//                    return subtract.compareTo(BigDecimal.valueOf(0));
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//                return 0;
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void sortbydesc(String select) {
//        try {
//            Class<?> foodclazz = Food.class;
//            Field field = foodclazz.getDeclaredField(select);
//            field.setAccessible(true);
//            foods.sort((o1, o2) -> {
//                try {
//                    BigDecimal subtract = ((BigDecimal) field.get(o2)).subtract((BigDecimal) field.get(o1));
//                    return subtract.compareTo(BigDecimal.valueOf(0));
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//                return 0;
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


}
