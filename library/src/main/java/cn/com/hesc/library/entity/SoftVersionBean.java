package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 当前应用软件版本
 * created by liujunlin on 2020/1/6 11:28
 */
public class SoftVersionBean implements Serializable {
    /** 版本编号 */
    protected Integer versionCode;
    /** 版本发布号 */
    protected String versionName;

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
}
