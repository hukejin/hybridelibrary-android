package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 信息存储结构体
 * created by liujunlin on 2020/1/7 14:11
 */
public class StorageBean implements Serializable {

    /** 存储成功 */
    protected boolean result = false;
    /** 存储的字符串 */
    protected String value;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
