package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2022-01-18
 */

@TableName("sys_nav")
public class Navigation extends Model<Navigation> {

    private String path;
    private String name;
    private String icon;

    @TableField("nav_sort")
    private int navSort;
    @TableField("nav_id")
    private String navID;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getNavSort() {
        return navSort;
    }

    public void setNavSort(int navSort) {
        this.navSort = navSort;
    }

    public String getNavID() {
        return navID;
    }

    public void setNavID(String navID) {
        this.navID = navID;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
