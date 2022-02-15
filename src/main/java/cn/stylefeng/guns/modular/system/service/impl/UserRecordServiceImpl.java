package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.UserRecordMapper;
import cn.stylefeng.guns.modular.system.model.UserRecord;
import cn.stylefeng.guns.modular.system.service.IUserRecordService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

/**
 * <p>
 * 用户记录表 服务实现类
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-18
 */
@Transactional
@Service
public class UserRecordServiceImpl extends ServiceImpl<UserRecordMapper, UserRecord> implements IUserRecordService {

    @Override
    public void inserRecord(int userid, String date, int height, int weight, int Calorie, int drink, int steps) {
        this.baseMapper.inserRecord(userid, date, height, weight, Calorie, drink, steps);
    }

    @Override
    public List<UserRecord> findRecentRecord(int userid, String beginTime, String endTime) {
        return this.baseMapper.findRecentRecord(userid, beginTime, endTime);
    }
}
