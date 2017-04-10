package com.ysr.common.baseapp;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.os.Vibrator;
import android.support.multidex.MultiDex;

import com.baidu.mapapi.SDKInitializer;
import com.ysr.BuildConfig;
import com.ysr.api.bean.EntityInfo;
import com.ysr.common.commonutils.LogUtils;
import com.ysr.map.LocationService;

/**
 * APPLICATION
 */
public class BaseApplication extends Application {

    private static BaseApplication baseApplication;
    public LocationService locationService;
    public Vibrator mVibrator;
    private EntityInfo entity;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        locationService = new LocationService(getApplicationContext());
        mVibrator = (Vibrator) getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);
        SDKInitializer.initialize(getApplicationContext());
        //初始化logger
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
    }

    public static Context getAppContext() {
        if (null == baseApplication) {
            throw new RuntimeException("必须先实例化Application");
        }
        return baseApplication;
    }

    public static BaseApplication getInstance() {
        if (null == baseApplication) {
            throw new RuntimeException("必须先实例化Application");
        }
        return baseApplication;
    }

    public static Resources getAppResources() {
        return baseApplication.getResources();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    /**
     * 分包
     *
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public EntityInfo getInfo() {
        if (entity == null) {
            entity = new EntityInfo();
        }
        return entity;
    }

    public void setInfo(EntityInfo entity) {
        this.entity = entity;
    }
}
