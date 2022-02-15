package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.Recipe;
import cn.stylefeng.guns.modular.system.model.Sport;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyw
 * @since 2022-01-31
 */

public interface ISportService extends IService<Sport> {

    List<Sport> findAll();
    List<Sport> findByName(@Param("name") String name);
    List<Sport> findByCategory(@Param("category") String category);

}
