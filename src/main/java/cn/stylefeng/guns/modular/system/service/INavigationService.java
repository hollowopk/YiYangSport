package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.Navigation;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyw
 * @since 2022-01-25
 */

public interface INavigationService extends IService<Navigation> {

    List<Navigation> findBySort(int sort);

}
