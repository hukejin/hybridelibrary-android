package cn.com.hesc.library;

import android.content.Context;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import javax.net.ssl.HttpsURLConnection;

/**
 * created by liujunlin on 2019/12/19 15:46
 */
public class WebViewClientSelf extends WebViewClient {

    protected HttpStatusListener mHttpStatusListener;
    private Context mContext;

    public void setHttpStatusListener(HttpStatusListener httpStatusListener) {
        this.mHttpStatusListener = httpStatusListener;
    }

    public interface HttpStatusListener{
        void onSuccess();
        void onError(int code);
    }

    public WebViewClientSelf(Context context){
        mContext = context;
    }

    public WebViewClientSelf(Context context, HttpStatusListener httpStatusListener){
        mContext = context;
        mHttpStatusListener = httpStatusListener;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        if(null != mHttpStatusListener){
            if(errorResponse.getStatusCode() == HttpsURLConnection.HTTP_OK)
                mHttpStatusListener.onSuccess();
            else
                mHttpStatusListener.onError(errorResponse.getStatusCode());
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
        view.loadUrl(url);
        return false;
    }
}
