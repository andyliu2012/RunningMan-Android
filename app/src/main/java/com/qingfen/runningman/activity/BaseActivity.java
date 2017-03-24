package com.qingfen.runningman.activity;


import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.text.TextUtils;

import com.qingfen.runningman.R;
import com.qingfen.runningman.activity.more.LoginActivity;
import com.qingfen.runningman.common.MyActivityManager;
import com.qingfen.runningman.common.MyApp;
import com.qingfen.runningman.utils.DialogUtil;
import com.qingfen.runningman.utils.ToastUtil;
import com.zhy.autolayout.AutoLayoutActivity;

/**
 * Created by admin on 2017/3/2.
 */

public abstract class BaseActivity extends AutoLayoutActivity {
    private DialogUtil mDialogUtil;
    /**
     * 等待对话框
     */
    public Dialog mBaseDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        baseInit();
    }

    /**
     * onCreate 初始化 布局、是否是极光、等待对话框
     */
    void baseInit() {
        int layoutId = getLayoutId();
        if (layoutId != 0) {
            this.setContentView(layoutId);
        }

        mDialogUtil = new DialogUtil(this);
        //添加到activity管理器
        MyActivityManager.getInstance().addActivity(this);

    }

    /**
     * 布局文件ID
     *
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 显示等待框
     *
     * @param msg
     */
    public void showLoadingDialog(String msg) {
        if (msg != null) {
            if (mBaseDialog != null && mBaseDialog.isShowing()) {
                mBaseDialog.dismiss();
                mBaseDialog = null;
            }
            mBaseDialog = mDialogUtil.showLoading(msg);
        }
    }

    /**
     * 取消等待框
     */
    public void hideLoadingDialog() {
        if (mBaseDialog != null && mBaseDialog.isShowing()) {
            mBaseDialog.dismiss();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyActivityManager.getInstance().finishActivity(this);
        if (mBaseDialog != null && mBaseDialog.isShowing()) {
            mBaseDialog.dismiss();
        }

    }

    /**
     * 获取token
     *
     * @return
     */
    public String getToken() {
        return MyApp.getApplication().getToken();
    }

    ;

    /**
     * 判断是否登录
     *
     * @return
     */
    public boolean isLogin() {
        if (TextUtils.isEmpty(MyApp.getApplication().getToken())) {
//            startActivity(new Intent(this, LoginActivity.class));
            return false;
        }
        return true;
    }

    /**
     * 判断是否登录 没登录去登陆
     *
     * @return
     */
    public boolean isLoginOrGoLogin() {
        if (TextUtils.isEmpty(MyApp.getApplication().getToken())) {
            ToastUtil.showShort(this, "您尚未登录，请登录");
            startActivity(new Intent(this, LoginActivity.class));
            return false;

        }
        return true;
    }

    /**
     * activity之间跳转
     *
     * @param cls
     * @param bundle
     */
    public void gotoAct(Class cls, Bundle bundle) {
        Intent intent = new Intent(this, cls);
        if (bundle != null)
            intent.putExtras(bundle);
        startActivity(intent);
    }

}
