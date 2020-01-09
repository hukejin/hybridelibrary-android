package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 地理信息结构体
 * created by liujunlin on 2020/1/7 15:49
 */
public class LocationBean implements Serializable {
    /** 经度 */
    protected Double longitude;
    /** 纬度 */
    protected Double latitude;
    /** 当前位置 */
    protected String address;
    /** 省 */
    protected String province;
     /** 省编码 */
    protected String provinceCode;
     /** 市 */
    protected String city;
     /** 市编码 */
    protected String cityCode;
     /** 区 */
    protected String adName;
     /** 区编码 */
    protected String adCode;
     /** poi名称 */
    protected String title;
     /** 格式化地址 */
    protected String formatted_address;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }
}
