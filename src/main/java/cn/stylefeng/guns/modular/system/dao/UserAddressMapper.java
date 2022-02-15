package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.Address;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface UserAddressMapper extends BaseMapper<Address> {
    List<Address> findAll(@Param("userid")Integer userid);
    void addAddress(@Param("userid")Integer userid,@Param("name")String name,@Param("phone") String phone,@Param("address")String address,@Param("code")String code);
    void updateAddress(@Param("id")Integer id,@Param("name")String name,@Param("phone") String phone,@Param("address")String address,@Param("code")String code);
    void deleteAddress(@Param("id")Integer id);
}
