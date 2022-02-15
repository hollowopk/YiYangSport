package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.RecipeMapper;
import cn.stylefeng.guns.modular.system.model.Food;
import cn.stylefeng.guns.modular.system.model.Recipe;
import cn.stylefeng.guns.modular.system.service.IRecipeService;
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
public class RecipeServiceImpl extends ServiceImpl<RecipeMapper, Recipe> implements IRecipeService {
    @Override
    public List<Recipe> findAll() {
        return this.baseMapper.findAll();
    }

    @Override
    public List<Recipe> findByName(String name) {
        return this.baseMapper.findByName(name);
    }

    @Override
    public List<Recipe> findByMethod(String method) {
        return this.baseMapper.findByMethod(method);
    }

    @Override
    public List<Recipe> findByTaste(String taste) {
        return this.baseMapper.findByTaste(taste);
    }

}
