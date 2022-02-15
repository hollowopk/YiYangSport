package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.Cart;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCartMapper extends BaseMapper<Cart> {
    Cart findifnull(@Param("goodid")Integer goodid,@Param("userid")Integer userid);
    void insertData(@Param("goodid")Integer goodid,@Param("userid")Integer userid,@Param("collect")Integer collect,@Param("cart")Integer cart);
    void updateCollect(@Param("goodid")Integer goodid,@Param("userid")Integer userid,@Param("collect")Integer collect);
    void updateCart(@Param("goodid")Integer goodid,@Param("userid")Integer userid,@Param("cart")Integer cart);
    List<Cart> findCollect(@Param("userid")Integer userid);
    List<Cart> findCart(@Param("userid")Integer userid);
}
