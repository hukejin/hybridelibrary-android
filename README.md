## android 混合开发框架
### 提供JS调用的原生能力，通过包的形式提供给应用进行具体功能实现 
---
## 项目说明
### library为包依赖工程，提供了可扩展的能力设计，完成JS调用原生对接，项目对接通过gradle方式引入
---
### 功能总览
<table style="width: 100vw">
<tr style="width: 100vw">
    <th>分类</th>
    <th>接口说明</th>
    <th>函数名</th>
    <th>结构体</th>
</tr>
<tr>
    <td>容器</td>
    <td>获取容器版本号</td>
    <td>getSoftVersion</td>
    <td>cn.com.hesc.library.entity.SoftVersionBean</td>
</tr>
<tr>
    <td rowspan="5">弹窗</td>
    <td>alert</td>
    <td>dialogAlert</td>
    <td>无</td>
</tr>
<tr>
    <td>confirm</td>
    <td>dialogConfirm</td>
    <td>cn.com.hesc.library.entity.ConfirmBean</td>
</tr>
<tr>
    <td>toast</td>
    <td>dialogToast</td>
    <td>无</td>
</tr>
<tr>
    <td>单选</td>
    <td>dialogSignal</td>
    <td>cn.com.hesc.library.entity.SignalConfirmBean</td>
</tr>
<tr>
    <td>多选</td>
    <td>dialogMulti</td>
    <td>cn.com.hesc.library.entity.MultiConfirmBean</td>
</tr>
<tr>
    <td rowspan="3">设备</td>
    <td>获取网络类型</td>
    <td>getNetworkType</td>
    <td>cn.com.hesc.library.entity.NetWorkBean</td>
</tr>
<tr>
    <td>获取uuid</td>
    <td>getUUID</td>
    <td>cn.com.hesc.library.entity.UUIDBean</td>
</tr>
<tr>
    <td>获取手机基础信息</td>
    <td>getPhoneInfo</td>
    <td>cn.com.hesc.library.entity.DeviceInfoBean</td>
</tr>
<tr>
  <td rowspan="3">日期&月历</td>
  <td>日期选择器</td>
  <td>getDate</td>
  <td>cn.com.hesc.library.entity.DateBean</td>
</tr>
<tr>
  <td>时间选择器</td>
  <td>getTime</td>
  <td>cn.com.hesc.library.entity.DateBean</td>
</tr>
<tr>
  <td>日期及时间选择器</td>
  <td>getDateTime</td>
  <td>cn.com.hesc.library.entity.DateBean</td>
</tr>
<tr>
    <td rowspan="7">导航栏</td>
    <td>设置导航栏颜色</td>
    <td>setNavigationBarbg</td>
    <td>无</td>
</tr>
<tr>
    <td>设置左侧导航按钮</td>
    <td>setNavigationBarLeft</td>
    <td>无</td>
</tr>
<tr>
    <td>设置导航栏右侧单个按钮</td>
    <td>setNavigationBarRight</td>
    <td>无</td>
</tr>
<tr>
      <td>替换页面</td>
      <td>setNavigationBarReplace</td>
    <td>无</td>
</tr>
<tr>
  <td>设置导航栏标题</td>
  <td>setNavigationBarTitle</td>
    <td>无</td>
</tr>
<tr>
  <td>关闭当前页面</td>
  <td>setNavigationBarClose</td>
    <td>无</td>
</tr>
<tr>
     <td>返回上一级页面</td>
     <td>setNavigationBarGoBack</td>
    <td>无</td>
</tr>
<tr>
     <td>UI控件</td>
     <td>设置顶部进度条颜色</td>
     <td>setUIProgressBarBG</td>
     <td>无</td>
</tr>
<tr>
     <td>扫码</td>
     <td>扫二维码</td>
     <td>scan</td>
     <td>cn.com.hesc.library.entity.ScanBean</td>
</tr>
<tr>
    <td rowspan="3">存储</td>
    <td>设置存储信息</td>
    <td>setLocalStorage</td>
    <td>cn.com.hesc.library.entity.StorageBean</td>
</tr>
<tr>
    <td>获取存储信息</td>
    <td>getLocalStorage</td>
    <td>cn.com.hesc.library.entity.StorageBean</td>
</tr>
<tr>
    <td>删除存储信息</td>
    <td>removeLocalStorage</td>
    <td>cn.com.hesc.library.entity.StorageBean</td>
</tr>
<tr>
    <td rowspan="2">地图</td>
    <td>获取当前GPS坐标</td>
    <td>getLocalGPS</td>
    <td>cn.com.hesc.library.entity.LocationBean</td>
</tr>
<tr>
    <td>打开地图并定位</td>
    <td>openMap</td>
    <td>cn.com.hesc.library.entity.LocationBean</td>
</tr>
<tr>
    <td>业务</td>
    <td>打开APP应用</td>
    <td>openApp</td>
    <td>无</td>
</tr>
<tr>
    <td>文件</td>
    <td>下载文件</td>
    <td>downloadFile</td>
    <td>无</td>
</tr>
<tr>
    <td rowspan="3">图片</td>
    <td>拍照</td>
    <td>capture</td>
    <td>cn.com.hesc.library.entity.CaptureBean</td>
</tr>
<tr>
    <td>选择图片</td>
    <td>selectPictures</td>
    <td>cn.com.hesc.library.entity.CaptureBean</td>
</tr>
<tr>
    <td>图片预览</td>
    <td>previewPictures</td>
    <td>无</td>
</tr>
<tr>
    <td rowspan="2">电话</td>
    <td>拨打电话</td>
    <td>callPhone</td>
    <td>无</td>
</tr>
<tr>
    <td>发送短信</td>
    <td>sendSMG</td>
    <td>无</td>
</tr>
<tr>
    <td rowspan="8">音频接口</td>
    <td>开始录音</td>
    <td>startRecordAudio</td>
    <td>无</td>
</tr>
<tr>
    <td>停止录音</td>
    <td>stopRecordAudio</td>
    <td>cn.com.hesc.library.entity.VoiceBean</td>
</tr>
<tr>
    <td>监听录音自动停止</td>
    <td>recordAudioSubscribe</td>
    <td>cn.com.hesc.library.entity.VoiceBean</td>
</tr>
<tr>
    <td>播放语音</td>
    <td>playAudio</td>
    <td>无</td>
</tr>
<tr>
    <td>暂停播放语音</td>
    <td>pauseAudio</td>
    <td>无</td>
</tr>
<tr>
    <td>恢复暂停播放的语音</td>
    <td>resumeAudio</td>
    <td>无</td>
</tr>
<tr>
    <td>停止播放音频</td>
    <td>stopAudio</td>
    <td>无</td>
</tr>
<tr>
    <td>监听播放自动停止</td>
    <td>playAudioSubscribe</td>
    <td>无</td>
</tr>
<tr>
    <td>打开新页面</td>
    <td>在新窗口上打开链接</td>
    <td>openHrefUrl</td>
    <td>无</td>
</tr>
</table>

### 详细用法   
1. 创建activity，继承cn.com.hesc.library.HybrideBaseActivity
2. 通过layout或者代码引入cn.com.hesc.library.ExtendsWebView
3. 对ExtendsWebView进行相关设置，以下代码可以直接拷贝使用
```
webView.setWebViewClient(new WebViewClientSelf(this, new WebViewClientSelf.HttpStatusListener() {
            @Override
            public void onSuccess() {
                //页面加载完成回调
            }

            @Override
            public void onError(int code) {
                //页面加载失败回调，如404，5XX等
            }
        }));
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, final int newProgress) {
                //页面加载进度，newProgress进度值 0-100
            }
            
            /** 支持input type=file时的文件选择 */
            protected void openFileChooser(ValueCallback uploadMsg, String acceptType)
            {
                mUploadMessage = uploadMsg;
                Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                i.addCategory(Intent.CATEGORY_OPENABLE);
                i.setType("*/*");
                startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
            }
            // For Lollipop 5.0+ Devices
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams)
            {
                if (uploadMessage != null) {
                    uploadMessage.onReceiveValue(null);
                    uploadMessage = null;
                }
                uploadMessage = filePathCallback;
                Intent intent = fileChooserParams.createIntent();
                try
                {
                    startActivityForResult(intent, REQUEST_SELECT_FILE);
                } catch (ActivityNotFoundException e)
                {
                    uploadMessage = null;
                    Toast.makeText(getBaseContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
                    return false;
                }
                return true;
            }
            //For Android 4.1 only
            protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture)
            {
                mUploadMessage = uploadMsg;
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("*/*");
                startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
            }

            protected void openFileChooser(ValueCallback<Uri> uploadMsg)
            {
                mUploadMessage = uploadMsg;
                Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                i.addCategory(Intent.CATEGORY_OPENABLE);
                i.setType("*/*");
                startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
            }
        });
        /** 建立JS桥接功能 */
        webView.addJavascriptInterface(new JavaScriptInterface(this),"Native");
```
4. 根据业务需求实现部分/全部上述表格方法
5. JS通信统一采用

```
cn.com.hesc.library.MessageHandler{
    String callbackId = "";//JS生成的唯一标识码,不填写即为原生主动调用JS功能   
    Object res;//调用原生功能结束后的返回值对象   
    boolean success = true;//原生功能调用成功   false失败   
    boolean running = false;//只适用于上传图片、下载文件时设置为true   
}

webView.excuteJs(messageHandler);
```