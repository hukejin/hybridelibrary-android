package cn.com.hesc.library;

/**
 * JS 调用原生功能
 * created by liujunlin on 2019/12/31 14:44
 */
public enum ActionType {
    VERSION, /** 获取容器版本号 */
    DIALOG_ALERT,/** alert */
    DIALOG_CONFIRM,/** confirm */
    DIALOG_TOAST,/** toast */
    DIALOG_SIGNAL,/** 单选框 */
    DIALOG_MULTIPLE,/** 多选框 */
    DEVICE_NETWORKTYPE,/** 获取当前网络类型 */
    DEVICE_UUID, /** 获取设备唯一编码imei */
    DEVICE_PHONEINFO,/** 获取设备电话硬件信息 */
    DEVICE_SCAN, /** 扫描二维码 */
    DEVICE_SAVEDATA,/** 保存数据 */
    DEVICE_GETDATA, /** 获取数据 */
    DEVICE_REMOVEDATA,/** 移除数据 */
    DEVICE_GETGPS,/** 获取GPS */
    DEVICE_OPENMAP,/** 打开地图 */
    DEVICE_OPENAPP,/** 打开第三方APP */
    DEVICE_OPENWEB,/** 在新窗口打开链接 */
    DEVICE_STARTRECORD,/** 开始录音 */
    DEVICE_STOPRECORD,/** 停止录音 */
    DEVICE_ONRECORDEND,/** 监听录音自动停止 */
    DEVICE_PLAY,/** 播放音频 */
    DEVICE_PAUSE,/** 暂停音频 */
    DEVICE_RESUME,/** 继续播放 */
    DEVICE_STOP,/** 停止播放 */
    DEVICE_PLAYEND,/** 监听播放完成 */
    DATE_DATE,/** 选择日期 */
    DATE_TIME,/** 选择时间 */
    DATE_DATEANDTIME,/** 选择时间和日期 */
    NAVIGATION_BAR_BACKGROUND,/** 设置标题栏背景色 */
    NAVIGATION_BAR_TITLE,/** 设置标题栏标题 */
    NAVIGATION_BAR_LEFT,/** 设置左边按钮和文本 */
    NAVIGATION_BAR_RIGHT,/** 设置右边按钮和文本 */
    NAVIGATION_BAR_REPLACE,/** 替换当前页面 */
    NAVIGATION_BAR_CLOSE,/** 关闭当前浏览器 */
    NAVIGATION_BAR_GOBACK,/** 浏览器上一步，如果是根目录则关闭浏览器 */
    UI_LOADINGPROGRESS,/** 设置页面加载进度条颜色 */
    DOWNLOADFILE,/** 下载文件 */
    CAPTURE,/** 拍照 */
    SELECT_PICTURES,/** 选择图片 */
    PREVIEWPICTURES,/** 预览图片 */
    CALL,/** 拨打电话 */
    SMG,/** 发送信息 */
    NATIVE_METHOD/**调用原生自定义功能**/
}
