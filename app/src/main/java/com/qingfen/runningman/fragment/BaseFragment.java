package com.qingfen.runningman.fragment;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qingfen.runningman.R;
import com.qingfen.runningman.activity.BaseActivity;
import com.qingfen.runningman.activity.more.LoginActivity;
import com.qingfen.runningman.common.MyApp;
import com.qingfen.runningman.utils.DialogUtil;
import com.qingfen.runningman.utils.ToastUtil;

/**
 * Created by admin on 2017/3/2.
 */

public abstract class BaseFragment extends Fragment {
    public DialogUtil mDialogUtil = null;
    public Dialog mBaseDialog = null;



    protected abstract void initView(View view, Bundle savedInstanceState);

    //获取fragment布局文件ID
    protected abstract int getLayoutId();

    public BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        initView(view, savedInstanceState);
        mDialogUtil = new DialogUtil(getActivity());
        return view;
    }

    public void addFragment(BaseFragment fragment, int containerId) {
        getChildFragmentManager().beginTransaction().add(containerId, fragment).commitAllowingStateLoss();
    }

    public void replaceFragment(BaseFragment fragment, int containerId) {
        getChildFragmentManager().beginTransaction().replace(containerId, fragment).commitAllowingStateLoss();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mBaseDialog != null && mBaseDialog.isShowing()) {
            mBaseDialog.dismiss();
        }
    }

    public void showLoadingDialog(String msg) {
        if (mBaseDialog != null && mBaseDialog.isShowing()) {
            mBaseDialog.dismiss();
            mBaseDialog = null;
        }
        if (mDialogUtil == null) mDialogUtil = new DialogUtil(getActivity());
        mBaseDialog = mDialogUtil.showLoading();
        if (!mBaseDialog.isShowing())
            mBaseDialog.show();
    }

    public void hideLoadingDialog() {
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

    /**
     * 判断是否登录
     *未登录，去登陆
     * @return
     */
    public boolean isLogin() {
        if (TextUtils.isEmpty(MyApp.getApplication().getToken())) {
            ToastUtil.showShort(getActivity(), "请去登录");
            startActivity(new Intent(getActivity(), LoginActivity.class));
            return false;

        } else
            return true;
    }
    /**
     * 判断是否登录
     *没有去登陆行为
     * @return
     */
    public boolean isLoginWithoutAction() {
        return !TextUtils.isEmpty(MyApp.getApplication().getToken());
    }
}
