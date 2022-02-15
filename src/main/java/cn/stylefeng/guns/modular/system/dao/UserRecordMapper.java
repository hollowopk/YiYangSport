package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.UserRecord;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

/**
 * <p>
 * 用户记录表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-18
 */
public interface UserRecordMapper extends BaseMapper<UserRecord> {

    void inserRecord(@Param("userid") int userid, @Param("date") String date, @Param("height") int height, @Param("weight") int weight, @Param("Calorie") int Calorie, @Param("drink") int drink, @Param("steps") int steps);

    List<UserRecord> findRecentRecord(@Param("userid") int userid,@Param("beginTime") String beginTime,@Param("endTime") String endTime);

}
