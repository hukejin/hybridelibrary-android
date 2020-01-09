package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 扫描条形码、二维码
 * created by liujunlin on 2020/1/7 12:34
 */
public class ScanBean implements Serializable {
    /** 识别的文本信息 */
    protected String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
