package com.qingfen.runningman.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast统一管理类
 */
public class ToastUtil {

    protected static Toast toast=null;
    /*cannot be instantiated*/
    private ToastUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {
        if (toast != null) {
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        } else {
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message) {
        if (toast != null) {
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        } else {
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {
        if (toast != null) {
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
        } else {
            toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message) {
        if (toast != null) {
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
        } else {
            toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int duration) {
        if (toast != null) {
            toast.setText(message);
            toast.setDuration(duration);
            toast.show();
        } else {
            toast = Toast.makeText(context, message, duration);
            toast.show();
        }
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, int message, int duration) {
        if (toast != null) {
            toast.setText(message);
            toast.setDuration(duration);
            toast.show();
        } else {
            toast = Toast.makeText(context, message, duration);
            toast.show();
        }
    }

}