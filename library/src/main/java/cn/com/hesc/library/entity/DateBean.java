package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 日期选择结构体
 * created by liujunlin on 2020/1/6 16:56
 */
public class DateBean implements Serializable {
    /** 选定的日期值  yyyy-MM-dd */
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
