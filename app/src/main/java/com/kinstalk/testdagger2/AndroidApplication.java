package com.kinstalk.testdagger2;

import android.app.Application;

/**
 * Created by mamingzhang on 16/10/12.
 */
public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

}
