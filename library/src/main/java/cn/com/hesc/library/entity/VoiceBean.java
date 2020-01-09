package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 音频文件结构体
 * created by liujunlin on 2020/1/9 15:30
 */
public class VoiceBean implements Serializable {
    /** 音频文件的url地址 */
    protected String mediaUrl;
    /** 录音时长，以秒为单位 */
    protected long duration;

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
