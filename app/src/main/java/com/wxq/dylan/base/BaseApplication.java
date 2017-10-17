package com.wxq.dylan.base;

import android.app.Application;

import com.dylan.baselib.utils.log.KLog;

/**
 * Created by wangxiaoqing on 2017/10/16.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /*LOG日志初始化*/
        KLog.init(true,"KLog");

    }
}
