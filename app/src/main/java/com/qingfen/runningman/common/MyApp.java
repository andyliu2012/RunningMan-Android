package com.qingfen.runningman.common;

import android.app.Application;
import android.text.TextUtils;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.qingfen.runningman.exception.CrashHandler;
import com.qingfen.runningman.utils.LogUtil;
import com.qingfen.runningman.utils.SharedpUtil;
import com.zhy.autolayout.config.AutoLayoutConifg;



/**
 * Created by rufeng on 2016/9/29.
 */
public class MyApp extends Application {
    private static MyApp mApp = null;

    private String token = "";



    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;

        //配置是否显示log
        LogUtil.isDebug = true;



        /*autolayout*/
        AutoLayoutConifg.getInstance().useDeviceSize();

        //初始化异常捕捉类
        if (!LogUtil.isDebug)
            CrashHandler.getInstance().init(getApplicationContext());
        //初始化okgo
        initOk();





        //给token赋值
        setToken((String) SharedpUtil.get(this, SharedpUtil.TableName.user, SharedpUtil.KEY_USER_TOKEN, ""));
        String userMoreStr = (String) SharedpUtil.get(this, SharedpUtil.TableName.user, SharedpUtil.KEY_USER_MORE, "");
        LogUtil.e("userMoreStr:" + userMoreStr);


    }

    private void initOk() {
        //---------这里给出的是示例代码,告诉你可以这么传,实际使用的时候,根据需要传,不需要就不传-------------//
//        HttpHeaders headers = new HttpHeaders();
//        headers.put("commonHeaderKey1", "commonHeaderValue1");    //header不支持中文
//        headers.put("commonHeaderKey2", "commonHeaderValue2");
//        HttpParams params = new HttpParams();
//        params.put("commonParamsKey1", "commonParamsValue1");     //param支持中文,直接传,不要自己编码
//        params.put("commonParamsKey2", "这里支持中文参数");
        //-----------------------------------------------------------------------------------//

        //必须调用初始化
        OkGo.init(this);

        //以下设置的所有参数是全局参数,同样的参数可以在请求的时候再设置一遍,那么对于该请求来讲,请求中的参数会覆盖全局参数
        //好处是全局参数统一,特定请求可以特别定制参数
        try {

            //以下都不是必须的，根据需要自行选择,一般来说只需要 debug,缓存相关,cookie相关的 就可以了
            OkGo.getInstance()
                    //可以设置https的证书,以下几种方案根据需要自己设置
                    .setCertificates()                                  //方法一：信任所有证书,不安全有风险
                    // .setCertificates(new SafeTrustManager())            //方法二：自定义信任规则，校验服务端证书
//                     .setCertificates(getAssets().open("root.cer"))      //方法三：使用预埋证书，校验服务端证书（自签名证书）
                    //方法四：使用bks证书和密码管理客户端证书（双向认证），使用预埋证书，校验服务端证书（自签名证书）
                    // .setCertificates(getAssets().open("xxx.bks"), "123456", getAssets().open("yyy.cer"))//

                    //配置https的域名匹配规则，详细看demo的初始化介绍，不需要就不要加入，使用不当会导致https握手失败
                    // .setHostnameVerifier(new SafeHostnameVerifier())
                    //如果使用默认的 60秒,以下三行也不需要传
                    .setConnectTimeout(Constant.DEFAULT_TIMEOUT)  //全局的连接超时时间
                    .setReadTimeOut(Constant.DEFAULT_TIMEOUT)     //全局的读取超时时间
                    .setWriteTimeOut(Constant.DEFAULT_TIMEOUT)    //全局的写入超时时间
                    //可以全局统一设置缓存模式,默认是不使用缓存,可以不传,具体其他模式看 github 介绍 https://github.com/jeasonlzy/
                    .setCacheMode(CacheMode.NO_CACHE);

            //可以全局统一设置缓存时间,默认永不过期,具体使用方法看 github 介绍
//                    .setCacheTime(CacheEntity.CACHE_NEVER_EXPIRE)

            //可以全局统一设置超时重连次数,默认为三次,那么最差的情况会请求4次(一次原始请求,三次重连请求),不需要可以设置为0
//                    .setRetryCount(3)

            //如果不想让框架管理cookie,以下不需要
//                .setCookieStore(new MemoryCookieStore())                //cookie使用内存缓存（app退出后，cookie消失）
//                    .setCookieStore(new PersistentCookieStore())          //cookie持久化存储，如果cookie不过期，则一直有效

            //可以添加全局拦截器,不会用的千万不要传,错误写法直接导致任何回调不执行
//                .addInterceptor(new Interceptor() {
//                    @Override
//                    public Response intercept(Chain chain) throws IOException {
//                        return chain.proceed(chain.request());
//                    }
//                })

            //这两行同上,不需要就不要传
//                    .addCommonHeaders(headers)                                         //设置全局公共头
//                    .addCommonParams(params);                                          //设置全局公共参数
            //打开该调试开关,控制台会使用 红色error 级别打印log,并不是错误,是为了显眼,不需要就不要加入该行
            if (LogUtil.isDebug)
                OkGo.getInstance().debug("OkGo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getToken() {
        LogUtil.e("token", token);
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static MyApp getApplication() {
        return mApp;
    }



    public void clearUserData() {
        setToken("");

    }
}
