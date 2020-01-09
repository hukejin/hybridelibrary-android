package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 弹窗结构体
 * created by liujunlin on 2020/1/6 11:31
 */
public class ConfirmBean implements Serializable {
    /** 点击的按钮索引 */
    protected Integer buttonIndex;

    public Integer getButtonIndex() {
        return buttonIndex;
    }

    public void setButtonIndex(Integer buttonIndex) {
        this.buttonIndex = buttonIndex;
    }
}
