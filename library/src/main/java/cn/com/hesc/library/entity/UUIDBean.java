package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 设备唯一编码imei
 * created by liujunlin on 2020/1/6 16:11
 */
public class UUIDBean implements Serializable {
    /** imei编码 */
    protected String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
