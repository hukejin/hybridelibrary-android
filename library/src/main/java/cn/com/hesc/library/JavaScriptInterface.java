package cn.com.hesc.library;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.JavascriptInterface;

import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.CALL;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.CAPTURE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DATE_DATE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DATE_DATEANDTIME;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DATE_TIME;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_GETDATA;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_GETGPS;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_NETWORKTYPE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_ONRECORDEND;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_OPENAPP;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_OPENMAP;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_OPENWEB;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_PAUSE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_PHONEINFO;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_PLAY;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_PLAYEND;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_REMOVEDATA;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_RESUME;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_SAVEDATA;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_SCAN;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_STARTRECORD;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_STOP;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_STOPRECORD;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DEVICE_UUID;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DIALOG_ALERT;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DIALOG_CONFIRM;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DIALOG_MULTIPLE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DIALOG_SIGNAL;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DIALOG_TOAST;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.DOWNLOADFILE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.NAVIGATION_BAR_BACKGROUND;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.NAVIGATION_BAR_CLOSE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.NAVIGATION_BAR_GOBACK;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.NAVIGATION_BAR_LEFT;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.NAVIGATION_BAR_REPLACE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.NAVIGATION_BAR_RIGHT;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.NAVIGATION_BAR_TITLE;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.PREVIEWPICTURES;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.SELECT_PICTURES;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.SMG;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.UI_LOADINGPROGRESS;
import static cn.com.hesc.hybrideandroid.components.webviewpg.ActionType.VERSION;

/**
 * created by liujunlin on 2019/12/20 11:27
 */
public class JavaScriptInterface {

    private ExtendsWebView webView;
    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public JavaScriptInterface(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    @JavascriptInterface
    public void handler(@NonNull String method, @Nullable String params){
        switch (method) {
            case "soft.version":
                actionListener.onAction(VERSION, params);
                break;
            case "device.notification.alert":
                actionListener.onAction(DIALOG_ALERT, params);
                break;
            case "device.notification.confirm":
                actionListener.onAction(DIALOG_CONFIRM, params);
                break;
            case "device.notification.toast":
                actionListener.onAction(DIALOG_TOAST, params);
                break;
            case "biz.util.select":
                actionListener.onAction(DIALOG_SIGNAL, params);
                break;
            case "biz.util.multiSelect":
                actionListener.onAction(DIALOG_MULTIPLE, params);
                break;
            case "device.connection.getNetworkType":
                actionListener.onAction(DEVICE_NETWORKTYPE, params);
                break;
            case "device.base.getUUID":
                actionListener.onAction(DEVICE_UUID, params);
                break;
            case "device.base.getPhoneInfo":
                actionListener.onAction(DEVICE_PHONEINFO, params);
                break;
            case "biz.util.scan":
                actionListener.onAction(DEVICE_SCAN, params);
                break;
            case "util.domainStorage.setItem":
                actionListener.onAction(DEVICE_SAVEDATA, params);
                break;
            case "util.domainStorage.getItem":
                actionListener.onAction(DEVICE_GETDATA, params);
                break;
            case "util.domainStorage.removeItem":
                actionListener.onAction(DEVICE_REMOVEDATA, params);
                break;
            case "device.geolocation.get":
                actionListener.onAction(DEVICE_GETGPS, params);
                break;
            case "biz.map.locate":
                actionListener.onAction(DEVICE_OPENMAP, params);
                break;
            case "biz.microApp.openApp":
                actionListener.onAction(DEVICE_OPENAPP, params);
                break;
            case "biz.util.openLink":
                actionListener.onAction(DEVICE_OPENWEB, params);
                break;
            case "device.audio.startRecord":
                actionListener.onAction(DEVICE_STARTRECORD, params);
                break;
            case "device.audio.stopRecord":
                actionListener.onAction(DEVICE_STOPRECORD, params);
                break;
            case "device.audio.onRecordEnd":
                actionListener.onAction(DEVICE_ONRECORDEND, params);
                break;
            case "device.audio.play":
                actionListener.onAction(DEVICE_PLAY, params);
                break;
            case "device.audio.pause":
                actionListener.onAction(DEVICE_PAUSE, params);
                break;
            case "device.audio.resume":
                actionListener.onAction(DEVICE_RESUME, params);
                break;
            case "device.audio.stop":
                actionListener.onAction(DEVICE_STOP, params);
                break;
            case "device.audio.onPlayEnd":
                actionListener.onAction(DEVICE_PLAYEND, params);
                break;
            case "biz.util.datepicker":
                actionListener.onAction(DATE_DATE, params);
                break;
            case "biz.util.timepicker":
                actionListener.onAction(DATE_TIME, params);
                break;
            case "biz.util.datetimepicker":
                actionListener.onAction(DATE_DATEANDTIME, params);
                break;
            case "biz.navigation.setbg":
                actionListener.onAction(NAVIGATION_BAR_BACKGROUND, params);
                break;
            case "biz.navigation.setTitle":
                actionListener.onAction(NAVIGATION_BAR_TITLE, params);
                break;
            case "biz.navigation.setLeft":
                actionListener.onAction(NAVIGATION_BAR_LEFT, params);
                break;
            case "biz.navigation.setRight":
                actionListener.onAction(NAVIGATION_BAR_RIGHT, params);
                break;
            case "biz.navigation.replace":
                actionListener.onAction(NAVIGATION_BAR_REPLACE, params);
                break;
            case "biz.navigation.close":
                actionListener.onAction(NAVIGATION_BAR_CLOSE, params);
                break;
            case "biz.navigation.goBack":
                actionListener.onAction(NAVIGATION_BAR_GOBACK, params);
                break;
            case "ui.progressBar.setColors":
                actionListener.onAction(UI_LOADINGPROGRESS, params);
                break;
            case "biz.util.downloadFile":
                actionListener.onAction(DOWNLOADFILE, params);
                break;
            case "device.media.capture":
                actionListener.onAction(CAPTURE, params);
                break;
            case "device.media.select":
                actionListener.onAction(SELECT_PICTURES, params);
                break;
            case "biz.util.previewImage":
                actionListener.onAction(PREVIEWPICTURES, params);
                break;
            case "biz.telephone.call":
                actionListener.onAction(CALL, params);
                break;
            case "biz.telephone.smg":
                actionListener.onAction(SMG, params);
                break;
        }
    }
}
