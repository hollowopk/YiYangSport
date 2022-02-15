package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.Food;
import cn.stylefeng.guns.modular.system.model.Recipe;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyw
 * @since 2022-01-28
 */

public interface IRecipeService extends IService<Recipe> {

    List<Recipe> findAll();
    List<Recipe> findByName(String name);
    List<Recipe> findByMethod(String method);
    List<Recipe> findByTaste(String taste);

}
