package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2022-01-31
 */

@Data
@TableName("sport")
public class Sport extends Model<Sport> {

    @TableField("sport_name")
    private String name;
    @TableField("sport_energy")
    private int energy;
    @TableField("sport_icon")
    private String icon;
    @TableField("sport_category")
    private String category;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
