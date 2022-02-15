package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.UserAddressMapper;
import cn.stylefeng.guns.modular.system.model.Address;
import cn.stylefeng.guns.modular.system.service.IUserAddressService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl extends ServiceImpl<UserAddressMapper, Address> implements IUserAddressService {
    @Override
    public List<Address> findAll(Integer userid) {
        return this.baseMapper.findAll(userid);
    }

    @Override
    public void addAddress(Integer userid, String name, String phone, String address, String code) {
        this.baseMapper.addAddress(userid, name, phone, address, code);
    }

    @Override
    public void updateAddress(Integer id, String name, String phone, String address, String code) {
        this.baseMapper.updateAddress(id, name, phone, address, code);
    }

    @Override
    public void deleteAddress(Integer id) {
        this.baseMapper.deleteAddress(id);
    }
}
