package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户记录表
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-18
 */
@TableName("user_record")
public class UserRecord extends Model<UserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 对应用户表id
     */
    private Integer userid;
    /**
     * 日期
     */
    private Date date;
    /**
     * 身高
     */
    private Integer height;
    /**
     * 体重
     */
    private Integer weight;
    /**
     * 摄入热量
     */
    private Integer Calorie;
    /**
     * 喝水量
     */
    private Integer drink;
    /**
     * 运动步数
     */
    private Integer steps;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCalorie() {
        return Calorie;
    }

    public void setCalorie(Integer Calorie) {
        this.Calorie = Calorie;
    }

    public Integer getDrink() {
        return drink;
    }

    public void setDrink(Integer drink) {
        this.drink = drink;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserRecord{" +
        ", id=" + id +
        ", userid=" + userid +
        ", date=" + date +
        ", height=" + height +
        ", weight=" + weight +
        ", Calorie=" + Calorie +
        ", drink=" + drink +
        ", steps=" + steps +
        "}";
    }
}
