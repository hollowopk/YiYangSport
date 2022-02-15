package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.RecipeMapper;
import cn.stylefeng.guns.modular.system.dao.SportMapper;
import cn.stylefeng.guns.modular.system.model.Recipe;
import cn.stylefeng.guns.modular.system.model.Sport;
import cn.stylefeng.guns.modular.system.service.IRecipeService;
import cn.stylefeng.guns.modular.system.service.ISportService;
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
 * @since 2022-01-28
 */

@Transactional
@Service
public class SportServiceImpl extends ServiceImpl<SportMapper, Sport> implements ISportService {
    @Override
    public List<Sport> findAll() {
        return this.baseMapper.findAll();
    }

    @Override
    public List<Sport> findByName(String name) {
        return this.baseMapper.findByName(name);
    }

    @Override
    public List<Sport> findByCategory(String category) {
        return this.baseMapper.findByCategory(category);
    }
}
