package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 文件下载结构体
 * created by liujunlin on 2020/1/8 15:24
 */
public class DownLoadBean implements Serializable {
    /** 下载后的手机文件路径 */
    protected String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
