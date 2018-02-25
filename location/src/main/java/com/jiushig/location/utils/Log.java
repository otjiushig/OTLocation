package com.jiushig.location.utils;

/**
 * Created by zk on 2017/6/4.
 * Log日志打印
 */

public class Log {

    public static int ERROR = 1;
    public static int WARN = 2;
    public static int INFO = 3;
    public static int DEBUG = 4;
    public static int VERBOSE = 5;
    public static int LOG_LEVEL = VERBOSE;


    public static void e(String tag, String msg) {
        if (LOG_LEVEL >= ERROR)
            android.util.Log.e(tag, msg);
    }

    public static void e(String tag, String msg, Exception e) {
        if (LOG_LEVEL >= ERROR)
            android.util.Log.e(tag, msg, e);
    }

    public static void w(String tag, String msg) {
        if (LOG_LEVEL >= WARN)
            android.util.Log.w(tag, msg);
    }

    public static void w(String tag, Throwable e) {
        if (LOG_LEVEL >= WARN)
            android.util.Log.w(tag, e);
    }

    public static void i(String tag, String msg) {
        if (LOG_LEVEL >= INFO)
            android.util.Log.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (LOG_LEVEL >= DEBUG)
            android.util.Log.d(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (LOG_LEVEL >= VERBOSE)
            android.util.Log.v(tag, msg);
    }

}
