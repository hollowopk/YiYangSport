package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.Address;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserAddressService extends IService<Address> {
    List<Address> findAll(Integer userid);
    void addAddress(Integer userid,String name,String phone,String address,String code);
    void updateAddress(Integer id,String name, String phone,String address,String code);
    void deleteAddress(Integer id);
}
