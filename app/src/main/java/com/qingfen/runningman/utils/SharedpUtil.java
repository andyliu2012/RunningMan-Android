package com.qingfen.runningman.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by zrb on 2016/10/12.
 * sharedperferances 工具类
 */

public class SharedpUtil {
    public static final String KEY_ASSIST_JPUSH_ALIAS_AND_TAGS = "jpushAliasAndTags";//辅助表 key 标记是否设置极光推送的别名和tag
    public static final String KEY_ASSIST_GUIDE = "guide";//辅助表 key 标记是否首次进入应用并引导
    public static final String KEY_USER_TOKEN="token";//user表 key token
    public static final String KEY_USER_PHONE="phone";//user表 key phone
    public static final String KEY_USER_TYPE="type";//user表 key type 标记用户类型
    public static final String KEY_USER_INVESTOR_IS_CHECKED="isChecked";//user 表 key isChecked  是否勾选合格投资人承诺书
    public static final String KEY_USER_MORE="usermore";//user表 key usermore 标记用户等多信息
    /**
     * 保存在手机里面的文件名
     */
    public enum TableName {
        user,//user信息表
        assist,//辅助sharedperferances表，记录user之外的信息。
    }

    /**
     * 保存数据的方法，我们需要拿到保存数据的具体类型，然后根据类型调用不同的保存方法
     *
     * @param context
     * @param key
     * @param object
     */
    public static void put(Context context, TableName tableName, String key, Object object) {

        SharedPreferences sp = context.getSharedPreferences(getFileName(tableName),
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        if (object instanceof String) {
            editor.putString(key, (String) object);
        } else if (object instanceof Integer) {
            editor.putInt(key, (Integer) object);
        } else if (object instanceof Boolean) {
            editor.putBoolean(key, (Boolean) object);
        } else if (object instanceof Float) {
            editor.putFloat(key, (Float) object);
        } else if (object instanceof Long) {
            editor.putLong(key, (Long) object);
        } else {
            editor.putString(key, object.toString());
        }

        SharedPreferencesCompat.apply(editor);
    }

    /**
     * 得到保存数据的方法，我们根据默认值得到保存的数据的具体类型，然后调用相对于的方法获取值
     *
     * @param context
     * @param key
     * @param defaultObject
     * @return
     */
    public static Object get(Context context, TableName tableName, String key, Object defaultObject) {
        SharedPreferences sp = context.getSharedPreferences(getFileName(tableName),
                Context.MODE_PRIVATE);

        if (defaultObject instanceof String) {
            return sp.getString(key, (String) defaultObject);
        } else if (defaultObject instanceof Integer) {
            return sp.getInt(key, (Integer) defaultObject);
        } else if (defaultObject instanceof Boolean) {
            return sp.getBoolean(key, (Boolean) defaultObject);
        } else if (defaultObject instanceof Float) {
            return sp.getFloat(key, (Float) defaultObject);
        } else if (defaultObject instanceof Long) {
            return sp.getLong(key, (Long) defaultObject);
        }

        return null;
    }

    /**
     * 移除某个key值已经对应的值
     *
     * @param context
     * @param key
     */
    public static void remove(Context context, TableName tableName, String key) {
        SharedPreferences sp = context.getSharedPreferences(getFileName(tableName),
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.remove(key);
        SharedPreferencesCompat.apply(editor);
    }

    private static String getFileName(TableName tableName) {
        return tableName.name();
    }

    /**
     * 清除所有数据
     *
     * @param context
     */
    public static void clear(Context context, TableName tableName) {
        SharedPreferences sp = context.getSharedPreferences(getFileName(tableName),
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        SharedPreferencesCompat.apply(editor);
    }

    /**
     * 查询某个key是否已经存在
     *
     * @param context
     * @param key
     * @return
     */
    public static boolean contains(Context context, TableName tableName, String key) {
        SharedPreferences sp = context.getSharedPreferences(getFileName(tableName),
                Context.MODE_PRIVATE);
        return sp.contains(key);
    }

    /**
     * 返回所有的键值对
     *
     * @param context
     * @return
     */
    public static Map<String, ?> getAll(Context context, TableName tableName) {
        SharedPreferences sp = context.getSharedPreferences(getFileName(tableName),
                Context.MODE_PRIVATE);
        return sp.getAll();
    }

    /**
     * 创建一个解决SharedPreferencesCompat.apply方法的一个兼容类
     *
     * @author zhy
     */
    private static class SharedPreferencesCompat {
        private static final Method sApplyMethod = findApplyMethod();

        /**
         * 反射查找apply的方法
         *
         * @return
         */
        @SuppressWarnings({"unchecked", "rawtypes"})
        private static Method findApplyMethod() {
            try {
                Class clz = SharedPreferences.Editor.class;
                return clz.getMethod("apply");
            } catch (NoSuchMethodException e) {
            }

            return null;
        }

        /**
         * 如果找到则使用apply执行，否则使用commit
         *
         * @param editor
         */
        public static void apply(SharedPreferences.Editor editor) {
            try {
                if (sApplyMethod != null) {
                    sApplyMethod.invoke(editor);
                    return;
                }
            } catch (IllegalArgumentException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
            editor.commit();
        }
    }
}
