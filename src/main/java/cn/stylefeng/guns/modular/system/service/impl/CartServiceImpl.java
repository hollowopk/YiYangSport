package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.UserCartMapper;
import cn.stylefeng.guns.modular.system.model.Cart;
import cn.stylefeng.guns.modular.system.service.IUserCartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl extends ServiceImpl<UserCartMapper, Cart> implements IUserCartService {
    @Override
    public Cart findifnull(Integer goodid, Integer userid) {
        return this.baseMapper.findifnull(goodid, userid);
    }

    @Override
    public void insert(Integer goodid, Integer userid, Integer collect, Integer cart) {
        this.baseMapper.insertData(goodid,userid,collect,cart);
    }

    @Override
    public void updateCollect(Integer goodid, Integer userid, Integer collect) {
        this.baseMapper.updateCollect(goodid, userid, collect);
    }

    @Override
    public void updateCart(Integer goodid, Integer userid, Integer cart) {
        this.baseMapper.updateCart(goodid, userid, cart);
    }

    @Override
    public List<Cart> findCollect(Integer userid) {
        return this.baseMapper.findCollect(userid);
    }

    @Override
    public List<Cart> findCart(Integer userid) {
        return this.baseMapper.findCart(userid);
    }
}
