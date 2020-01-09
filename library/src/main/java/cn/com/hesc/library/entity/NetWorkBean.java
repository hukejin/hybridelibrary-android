package cn.com.hesc.library.entity;

import java.io.Serializable;

/**
 * 当前网络信息结构
 * created by liujunlin on 2020/1/6 15:22
 */
public class NetWorkBean implements Serializable {
    /** 当期网络类型 unknown未知 wifi mobile none无网络*/
    protected String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
