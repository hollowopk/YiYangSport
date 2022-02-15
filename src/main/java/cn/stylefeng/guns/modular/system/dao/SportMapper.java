package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.Recipe;
import cn.stylefeng.guns.modular.system.model.Sport;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2022-01-31
 */

public interface SportMapper extends BaseMapper<Sport> {

    List<Sport> findAll();
    List<Sport> findByName(@Param("name") String name);
    List<Sport> findByCategory(@Param("category") String category);

}
