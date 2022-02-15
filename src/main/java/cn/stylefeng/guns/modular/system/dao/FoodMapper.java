package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.Food;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-17
 */
public interface FoodMapper extends BaseMapper<Food> {
    List<Food> findAll();
    List<Food> findByCategory(@Param("category") String category);
    List<Food> findByName(@Param("name") String name);
    List<Food> findByAsc(@Param("select") String select);
    List<Food> findByDesc(@Param("select") String select);
}
