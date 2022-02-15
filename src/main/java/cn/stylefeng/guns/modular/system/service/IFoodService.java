package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.Food;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-17
 */
public interface IFoodService extends IService<Food> {
    List<Food> findAll();
    List<Food> findByCategory(String category);
    List<Food> findByAsc(String select);
    List<Food> findByDesc(String select);
    List<Food> findByName(String name);
}
