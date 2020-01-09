package cn.com.hesc.library;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;


import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;

import static android.webkit.WebSettings.LOAD_NO_CACHE;

/**
 * created by liujunlin on 2019/12/23 14:22
 */
public class ExtendsWebView extends WebView {

    private HashMap<String, String> callBacks = new HashMap<>();
    private Context mContext;

    public ExtendsWebView(Context context) {
        super(context);
        mContext = context;
        initWebSetting();
    }

    public ExtendsWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initWebSetting();
    }

    protected void initWebSetting(){
        getSettings().setJavaScriptEnabled(true);
        getSettings().setCacheMode(LOAD_NO_CACHE);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
    }

    public void registerCallBack(String uniqueKey, String callBack){
        callBacks.put(uniqueKey,callBack);
    }

    public void removeCallBack(String uniqueKey){
        String item = callBacks.get(uniqueKey);
        if(!TextUtils.isEmpty(item))
            callBacks.remove(item);
    }

    /**
     * 在获取JS的调用指令后，完成任务回调JS
     * @param messageHandler
     */
    public synchronized void  excuteJs(final MessageHandler messageHandler){
        post(new Runnable() {
            @Override
            public void run() {
                try{
                    String resultStr = new Gson().toJson(messageHandler);
                    evaluateJavascript("javascript:callBack('"+resultStr+"')", new ValueCallback<String>() {
                        @Override
                        public void onReceiveValue(String value) {
                            Log.e("@@",value);
                        }
                    });
                    removeCallBack(messageHandler.getUniqueId());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
