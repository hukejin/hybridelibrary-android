package cn.com.hesc.library.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 拍照通信结构体
 * created by liujunlin on 2020/1/8 16:23
 */
public class CaptureBean implements Serializable {
    /** 发送base64的缩略图，只适用于图片和视频截图 */
    protected ArrayList<String> thumbnails;
    /** 已发送成功的图片url地址 */
    protected ArrayList<CaptureItme> pics;

    public ArrayList<String> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(ArrayList<String> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public ArrayList<CaptureItme> getPics() {
        return pics;
    }

    public void setPics(ArrayList<CaptureItme> pics) {
        this.pics = pics;
    }

    public static class CaptureItme{
        String path;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }

}
