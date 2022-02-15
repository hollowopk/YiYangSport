package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.FoodMapper;
import cn.stylefeng.guns.modular.system.model.Food;
import cn.stylefeng.guns.modular.system.service.IFoodService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-17
 */
@Transactional
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements IFoodService {

    @Override
    public List<Food> findAll() {
        return this.baseMapper.findAll();
    }

    @Override
    public List<Food> findByCategory(String category) {
        return this.baseMapper.findByCategory(category);
    }

    @Override
    public List<Food> findByAsc(String select) {
        return this.baseMapper.findByAsc(select);
    }

    @Override
    public List<Food> findByDesc(String select) {
        return this.baseMapper.findByDesc(select);
    }

    @Override
    public List<Food> findByName(String name) {
        return this.baseMapper.findByName(name);
    }
}
