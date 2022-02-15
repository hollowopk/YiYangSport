package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

@TableName("user_cart")
public class Cart extends Model<Cart> {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 对应商品表id
     */
    private Integer goodid;
    /**
     * 对应用户表id
     */
    private Integer userid;
    /**
      收藏： 0 未收藏 1收藏
     */
    private Integer collect;
    /**
     * 加购 代表购物车中数量 0表示购物车中没有
     */
    private Integer cart;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public Integer getCart() {
        return cart;
    }

    public void setCart(Integer cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", goodid=" + goodid +
                ", userid=" + userid +
                ", collect=" + collect +
                ", cart=" + cart +
                '}';
    }
}
