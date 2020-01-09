package cn.com.hesc.library;

import android.app.Activity;
import android.os.Bundle;

import org.json.JSONObject;

/**
 * 定义实现原生能力的基类
 */
public abstract class BaseActivity extends Activity implements ActionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAction(ActionType actionType, String params) {
        try{
            JSONObject jsonObject = new JSONObject(params);
            MessageHandler messageHandler = new MessageHandler();
            messageHandler.setUniqueId(jsonObject.getString("callbackId"));
            switch (actionType){
                case VERSION:
                    getSoftVersion(messageHandler);
                    break;
                case DIALOG_ALERT:
                    dialogAlert(messageHandler,params);
                    break;
                case DIALOG_CONFIRM:
                    dialogConfirm(messageHandler,params);
                    break;
                case DIALOG_TOAST:
                    dialogToast(messageHandler,params);
                    break;
                case DIALOG_SIGNAL:
                    dialogSignal(messageHandler,params);
                    break;
                case DIALOG_MULTIPLE:
                    dialogMulti(messageHandler,params);
                    break;
                case DEVICE_NETWORKTYPE:
                    getNetworkType(messageHandler,params);
                    break;
                case DEVICE_UUID:
                    getUUID(messageHandler,params);
                    break;
                case DEVICE_PHONEINFO:
                    getPhoneInfo(messageHandler,params);
                    break;
                case DATE_DATE:
                    getDate(messageHandler,params);
                    break;
                case DATE_TIME:
                    getTime(messageHandler,params);
                    break;
                case DATE_DATEANDTIME:
                    getDateTime(messageHandler,params);
                    break;
                case NAVIGATION_BAR_BACKGROUND:
                    setNavigationBarbg(messageHandler,params);
                    break;
                case NAVIGATION_BAR_TITLE:
                    setNavigationBarTitle(messageHandler,params);
                    break;
                case NAVIGATION_BAR_LEFT:
                    setNavigationBarLeft(messageHandler,params);
                    break;
                case NAVIGATION_BAR_RIGHT:
                    setNavigationBarRight(messageHandler,params);
                    break;
                case NAVIGATION_BAR_REPLACE:
                    setNavigationBarReplace(messageHandler,params);
                    break;
                case NAVIGATION_BAR_CLOSE:
                    setNavigationBarClose(messageHandler,params);
                    break;
                case NAVIGATION_BAR_GOBACK:
                    setNavigationBarGoBack(messageHandler,params);
                    break;
                case UI_LOADINGPROGRESS:
                    setUIProgressBarBG(messageHandler,params);
                    break;
                case DEVICE_SCAN:
                    scan(messageHandler,params);
                    break;
                case DEVICE_SAVEDATA:
                    setLocalStorage(messageHandler,params);
                    break;
                case DEVICE_GETDATA:
                    getLocalStorage(messageHandler,params);
                    break;
                case DEVICE_REMOVEDATA:
                    removeLocalStorage(messageHandler,params);
                    break;
                case DEVICE_GETGPS:
                    getLocalGPS(messageHandler,params);
                    break;
                case DEVICE_OPENMAP:
                    openMap(messageHandler,params);
                    break;
                case DEVICE_OPENAPP:
                    openApp(messageHandler,params);
                    break;
                case DOWNLOADFILE:
                    downloadFile(messageHandler,params);
                    break;
                case CAPTURE:
                    capture(messageHandler,params);
                    break;
                case SELECT_PICTURES:
                    selectPictures(messageHandler,params);
                    break;
                case PREVIEWPICTURES:
                    previewPictures(messageHandler,params);
                    break;
                case CALL:
                    callPhone(messageHandler,params);
                    break;
                case SMG:
                    sendSMG(messageHandler,params);
                    break;
                case DEVICE_STARTRECORD:
                    startRecordAudio(messageHandler,params);
                    break;
                case DEVICE_STOPRECORD:
                    stopRecordAudio(messageHandler,params);
                    break;
                case DEVICE_ONRECORDEND:
                    recordAudioSubscribe(messageHandler,params);
                    break;
                case DEVICE_PLAY:
                    playAudio(messageHandler,params);
                    break;
                case DEVICE_PAUSE:
                    pauseAudio(messageHandler,params);
                    break;
                case DEVICE_RESUME:
                    resumeAudio(messageHandler,params);
                    break;
                case DEVICE_STOP:
                    stopAudio(messageHandler,params);
                    break;
                case DEVICE_PLAYEND:
                    playAudioSubscribe(messageHandler,params);
                    break;
                case DEVICE_OPENWEB:
                    openHrefUrl(messageHandler,params);
                    break;

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取版本号
     * @param messageHandler
     */
    protected abstract void getSoftVersion(MessageHandler messageHandler);
    protected abstract void dialogAlert(MessageHandler messageHandler, String params);
    protected abstract void dialogConfirm(MessageHandler messageHandler, String params);
    protected abstract void dialogToast(MessageHandler messageHandler, String params);
    protected abstract void dialogSignal(MessageHandler messageHandler, String params);
    protected abstract void dialogMulti(MessageHandler messageHandler, String params);
    protected abstract void getNetworkType(MessageHandler messageHandler, String params);
    protected abstract void getUUID(MessageHandler messageHandler, String params);
    protected abstract void getPhoneInfo(MessageHandler messageHandler, String params);
    protected abstract void getDate(MessageHandler messageHandler, String params);
    protected abstract void getTime(MessageHandler messageHandler, String params);
    protected abstract void getDateTime(MessageHandler messageHandler, String params);
    protected abstract void setNavigationBarbg(MessageHandler messageHandler, String params);
    protected abstract void setNavigationBarTitle(MessageHandler messageHandler, String params);
    protected abstract void setNavigationBarLeft(MessageHandler messageHandler, String params);
    protected abstract void setNavigationBarRight(MessageHandler messageHandler, String params);
    protected abstract void setNavigationBarReplace(MessageHandler messageHandler, String params);
    protected abstract void setNavigationBarClose(MessageHandler messageHandler, String params);
    protected abstract void setNavigationBarGoBack(MessageHandler messageHandler, String params);
    protected abstract void setUIProgressBarBG(MessageHandler messageHandler, String params);
    protected abstract void scan(MessageHandler messageHandler, String params);
    protected abstract void setLocalStorage(MessageHandler messageHandler, String params);
    protected abstract void getLocalStorage(MessageHandler messageHandler, String params);
    protected abstract void removeLocalStorage(MessageHandler messageHandler, String params);
    protected abstract void getLocalGPS(MessageHandler messageHandler, String params);
    protected abstract void openMap(MessageHandler messageHandler, String params);
    protected abstract void openApp(MessageHandler messageHandler, String params);
    protected abstract void downloadFile(MessageHandler messageHandler, String params);
    protected abstract void capture(MessageHandler messageHandler, String params);
    protected abstract void selectPictures(MessageHandler messageHandler, String params);
    protected abstract void previewPictures(MessageHandler messageHandler, String params);
    protected abstract void callPhone(MessageHandler messageHandler, String params);
    protected abstract void sendSMG(MessageHandler messageHandler, String params);
    protected abstract void startRecordAudio(MessageHandler messageHandler, String params);
    protected abstract void stopRecordAudio(MessageHandler messageHandler, String params);
    protected abstract void recordAudioSubscribe(MessageHandler messageHandler, String params);
    protected abstract void playAudio(MessageHandler messageHandler, String params);
    protected abstract void pauseAudio(MessageHandler messageHandler, String params);
    protected abstract void resumeAudio(MessageHandler messageHandler, String params);
    protected abstract void stopAudio(MessageHandler messageHandler, String params);
    protected abstract void playAudioSubscribe(MessageHandler messageHandler, String params);
    protected abstract void openHrefUrl(MessageHandler messageHandler, String params);
}
