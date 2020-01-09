package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 单选弹出框
 * created by liujunlin on 2020/1/6 15:03
 */
public class SignalConfirmBean extends ConfirmBean implements Serializable {
    /** 选中的项*/
    protected String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
