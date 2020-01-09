package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 手机硬件信息结构体
 * created by liujunlin on 2020/1/6 16:20
 */
public class DeviceInfoBean implements Serializable {
    /** 手机屏幕宽度 */
    protected Integer screenWidth;
    /** 手机屏幕高度 */
    protected Integer screenHeight;
    /** 手机品牌 */
    protected String brand;
    /** 手机型号 */
    protected String model;
    /** 手机系统版本 */
    protected String version;
    /** 网络类型 wifi／mobile */
    protected String netInfo;
    /** 运营商信息 */
    protected String operatorType;

    public Integer getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }

    public Integer getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNetInfo() {
        return netInfo;
    }

    public void setNetInfo(String netInfo) {
        this.netInfo = netInfo;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }
}
