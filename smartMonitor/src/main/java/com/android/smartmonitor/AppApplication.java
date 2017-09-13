package com.android.smartmonitor;

import android.app.Application;

/**
 * @author: LiuJinrui
 * @description:
 */
public class AppApplication extends Application {

    public static AppApplication instance;


    public AppApplication() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }




    public static AppApplication getInstance() {
        return instance;
    }


    public void AppExit() {
        try {
            System.exit(0);
        } catch (Exception e) {

        }
    }

}
