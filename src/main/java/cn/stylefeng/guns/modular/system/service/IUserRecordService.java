package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.UserRecord;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

/**
 * <p>
 * 用户记录表 服务类
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-18
 */
public interface IUserRecordService extends IService<UserRecord> {
    void inserRecord(int userid, String date, int height, int weight, int Calorie, int drink, int steps);

    List<UserRecord> findRecentRecord(int userid, String beginTime, String endTime);
}
