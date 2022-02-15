package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.Cart;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserCartService extends IService<Cart> {
    Cart findifnull(Integer goodid,Integer userid);
    void insert(Integer goodid,Integer userid,Integer collect,Integer cart);
    void updateCollect(Integer goodid,Integer userid,Integer collect);
    void updateCart(Integer goodid,Integer userid,Integer cart);
    List<Cart> findCollect(Integer userid);
    List<Cart> findCart(Integer userid);
}
