package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.Food;
import cn.stylefeng.guns.modular.system.model.Recipe;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2022-01-28
 */

public interface RecipeMapper extends BaseMapper<Recipe> {

    List<Recipe> findAll();
    List<Recipe> findByName(@Param("name") String name);
    List<Recipe> findByMethod(@Param("method") String method);
    List<Recipe> findByTaste(@Param("taste") String taste);

}
