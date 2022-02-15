package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.NavigationMapper;
import cn.stylefeng.guns.modular.system.model.Navigation;
import cn.stylefeng.guns.modular.system.service.INavigationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyw
 * @since 2022-01-25
 */

@Transactional
@Service
public class NavigationServiceImpl extends ServiceImpl<NavigationMapper, Navigation> implements INavigationService {
    @Override
    public List<Navigation> findBySort(int sort) {
        return this.baseMapper.findBySort(sort);
    }
}
