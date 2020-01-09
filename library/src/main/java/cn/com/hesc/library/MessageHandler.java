package cn.com.hesc.library;

import java.io.Serializable;

/**
 * created by liujunlin on 2019/12/23 14:42
 */
public class MessageHandler implements Serializable {
    String callbackId = "";//JS生成的唯一标识码,不填写即为原生主动调用JS功能
    Object res;//调用原生功能结束后的返回值对象
    boolean success = true;//原生功能调用成功   false失败
    boolean running = false;//只适用于上传图片、下载文件时设置为true

    public String getUniqueId() {
        return callbackId;
    }

    public void setUniqueId(String uniqueId) {
        this.callbackId = uniqueId;
    }

    public Object getRes() {
        return res;
    }

    public void setRes(Object res) {
        this.res = res;
    }

    public String getCallbackId() {
        return callbackId;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        success = success;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
