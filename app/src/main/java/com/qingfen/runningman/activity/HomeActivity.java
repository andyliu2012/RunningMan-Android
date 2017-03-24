package com.qingfen.runningman.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;

import com.qingfen.runningman.R;
import com.qingfen.runningman.customview.AutoRadioGroup;
import com.qingfen.runningman.fragment.FirstFragment;
import com.qingfen.runningman.fragment.FourthFragment;
import com.qingfen.runningman.fragment.SecondFragment;
import com.qingfen.runningman.fragment.ThirdFragment;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by admin on 2017/3/2.
 */

public class HomeActivity extends BaseActivity {

    @BindView(R.id.main_content)
    FrameLayout mainContent;
    @BindView(R.id.main_radio_home)
    RadioButton mainRadioHome;
    @BindView(R.id.main_radio_product)
    RadioButton mainRadioProduct;
    @BindView(R.id.main_radio_me)
    RadioButton mainRadioMe;
    @BindView(R.id.main_radio_more)
    RadioButton mainRadioMore;
    @BindView(R.id.main_radioGroup)
    AutoRadioGroup mainRadioGroup;
    @BindView(R.id.main_fl)
    FrameLayout mainFl;
    private FirstFragment first;
    private SecondFragment second;
    private ThirdFragment third;
    private FourthFragment fouth;
    private ArrayList<Fragment> fragmentArrayList;

    private AutoRadioGroup radioGroup;
    private RadioButton radioHome;
    private Fragment mCurrentFrgment;
    private int currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        initFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }


    private void initFragment() {
        fragmentArrayList = new ArrayList<Fragment>();
        fragmentArrayList.add(new FirstFragment());
        fragmentArrayList.add(new SecondFragment());
        fragmentArrayList.add(new ThirdFragment());
        fragmentArrayList.add(new FourthFragment());

        radioHome.setSelected(true);
        changeTab(0);
    }

    private void changeTab(int index) {
        currentIndex = index;
        radioHome.setSelected(index == 0);
        mainRadioProduct.setSelected(index == 1);
        mainRadioMe.setSelected(index == 2);
        mainRadioMore.setSelected(index == 3);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        //判读当前的fragment是否为空，不为空则影藏
        if (null != mCurrentFrgment) {
            ft.hide(mCurrentFrgment);
        }
        //先根据Tag从FragmentTransaction事物获取之前添加的Fragment
        Fragment fragment = getFragmentManager().findFragmentByTag(fragmentArrayList.get(currentIndex).getClass().getName());
        if (null == fragment) {
            //如fragment为空，则之前未添加此Fragment。便从集合中取出
            fragment = fragmentArrayList.get(index);
        }
        mCurrentFrgment = fragment;
        //判断此Fragment是否已经添加到FragmentTransaction事物中
        if (!fragment.isAdded()) {
            ft.add(R.id.main_content, fragment, fragment.getClass().getName());
        } else {
            ft.show(fragment);
        }
        ft.commit();
    }
}
