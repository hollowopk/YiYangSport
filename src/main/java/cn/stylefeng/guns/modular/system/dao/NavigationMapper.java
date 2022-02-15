package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.Navigation;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NavigationMapper extends BaseMapper<Navigation> {

    List<Navigation> findBySort(@Param("sort") int sort);

}
