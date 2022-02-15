package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author stylefeng
 * @since 2022-01-17
 */
@TableName("food")
public class Food extends Model<Food> {

    private static final long serialVersionUID = 1L;

    private String category;
    private String name;
    private BigDecimal energy;
    private BigDecimal protein;
    private BigDecimal fat;
    private BigDecimal carbohydrate;
    private BigDecimal fiber;
    private BigDecimal vitaminA;
    private BigDecimal vitaminC;
    private BigDecimal vitaminE;
    private BigDecimal carotene;
    private BigDecimal vitaminB1;
    private BigDecimal vitaminB2;
    private BigDecimal niacin;
    private BigDecimal cholesterol;
    private BigDecimal Mg;
    private BigDecimal Ca;
    private BigDecimal Fe;
    private BigDecimal Zn;
    private BigDecimal Cu;
    private BigDecimal Mn;
    @TableField("K")
    private BigDecimal k;
    @TableField("P")
    private BigDecimal p;
    private BigDecimal Na;
    private BigDecimal Se;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
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

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public BigDecimal getFat() {
        return fat;
    }

    public void setFat(BigDecimal fat) {
        this.fat = fat;
    }

    public BigDecimal getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(BigDecimal carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public BigDecimal getFiber() {
        return fiber;
    }

    public void setFiber(BigDecimal fiber) {
        this.fiber = fiber;
    }

    public BigDecimal getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(BigDecimal vitaminA) {
        this.vitaminA = vitaminA;
    }

    public BigDecimal getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(BigDecimal vitaminC) {
        this.vitaminC = vitaminC;
    }

    public BigDecimal getVitaminE() {
        return vitaminE;
    }

    public void setVitaminE(BigDecimal vitaminE) {
        this.vitaminE = vitaminE;
    }

    public BigDecimal getCarotene() {
        return carotene;
    }

    public void setCarotene(BigDecimal carotene) {
        this.carotene = carotene;
    }

    public BigDecimal getVitaminB1() {
        return vitaminB1;
    }

    public void setVitaminB1(BigDecimal vitaminB1) {
        this.vitaminB1 = vitaminB1;
    }

    public BigDecimal getVitaminB2() {
        return vitaminB2;
    }

    public void setVitaminB2(BigDecimal vitaminB2) {
        this.vitaminB2 = vitaminB2;
    }

    public BigDecimal getNiacin() {
        return niacin;
    }

    public void setNiacin(BigDecimal niacin) {
        this.niacin = niacin;
    }

    public BigDecimal getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(BigDecimal cholesterol) {
        this.cholesterol = cholesterol;
    }

    public BigDecimal getMg() {
        return Mg;
    }

    public void setMg(BigDecimal Mg) {
        this.Mg = Mg;
    }

    public BigDecimal getCa() {
        return Ca;
    }

    public void setCa(BigDecimal Ca) {
        this.Ca = Ca;
    }

    public BigDecimal getFe() {
        return Fe;
    }

    public void setFe(BigDecimal Fe) {
        this.Fe = Fe;
    }

    public BigDecimal getZn() {
        return Zn;
    }

    public void setZn(BigDecimal Zn) {
        this.Zn = Zn;
    }

    public BigDecimal getCu() {
        return Cu;
    }

    public void setCu(BigDecimal Cu) {
        this.Cu = Cu;
    }

    public BigDecimal getMn() {
        return Mn;
    }

    public void setMn(BigDecimal Mn) {
        this.Mn = Mn;
    }

    public BigDecimal getK() {
        return k;
    }

    public void setK(BigDecimal k) {
        this.k = k;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getNa() {
        return Na;
    }

    public void setNa(BigDecimal Na) {
        this.Na = Na;
    }

    public BigDecimal getSe() {
        return Se;
    }

    public void setSe(BigDecimal Se) {
        this.Se = Se;
    }

    @Override
    protected Serializable pkVal() {
        return this.name;
    }

    @Override
    public String toString() {
        return "食物{" +
        "  食物类别=" + category +
        ", 食物名称=" + name +
        ", 热量=" + energy +
        ", 蛋白质=" + protein +
        ", 脂肪=" + fat +
        ", 碳水化合物=" + carbohydrate +
        ", 膳食纤维=" + fiber +
        ", 维生素A=" + vitaminA +
        ", 维生素C=" + vitaminC +
        ", 维生素E=" + vitaminE +
        ", 胡萝卜素=" + carotene +
        ", 维生素B1=" + vitaminB1 +
        ", 维生素B2=" + vitaminB2 +
        ", 烟酸=" + niacin +
        ", 胆固醇=" + cholesterol +
        ", 镁=" + Mg +
        ", 钙=" + Ca +
        ", 铁=" + Fe +
        ", 锌=" + Zn +
        ", 铜=" + Cu +
        ", 锰=" + Mn +
        ", 钾=" + k +
        ", 磷=" + p +
        ", 钠=" + Na +
        ", 硒=" + Se +
        "}";
    }
}
