package cn.com.hesc.library.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 多选弹出框结构体
 * created by liujunlin on 2020/1/6 15:12
 */
public class MultiConfirmBean extends ConfirmBean implements Serializable {
    /** 多选项勾选的内容 */
    protected ArrayList<String> items;

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
