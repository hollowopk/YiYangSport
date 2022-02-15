package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author lyw
 * @since 2022-01-18
 */

@TableName("recipe")
public class Recipe extends Model<Recipe> {

    private String name;
    private String avatar;

    private String taste;
    @TableField("cooking_method")
    private String cookingMethod;
    private String time;
    private String difficulty;

    private String steps;
    @TableField("steps_pic")
    private String stepsPic;

    private BigDecimal protein;
    private BigDecimal carbohydrate;
    private BigDecimal energy;

    private List<Map<String, BigDecimal>> composition;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getCookingMethod() {
        return cookingMethod;
    }

    public void setCookingMethod(String cookingMethod) {
        this.cookingMethod = cookingMethod;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String[] getSteps() {
        return steps.split("\\|");
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String[] getStepsPic() {
        return stepsPic.split("\\|");
    }

    public void setStepsPic(String stepsPic) {
        this.stepsPic = stepsPic;
    }

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public BigDecimal getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(BigDecimal carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public String getName() {
        return name;
    }

    public List<Map<String, BigDecimal>> getComposition() {
        return composition;
    }

    public void setComposition(List<Map<String, BigDecimal>> composition) {
        this.composition = composition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getEnergy() {
        return energy;
    }

    public void setEnergy(BigDecimal energy) {
        this.energy = energy;
    }

    @Override
    protected Serializable pkVal() {
        return this.name;
    }
}
