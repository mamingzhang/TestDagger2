package com.kinstalk.testdagger2;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mamingzhang on 16/10/9.
 */
@Module
public class ApplicationModule {

    private final AndroidApplication androidApplication;

    public ApplicationModule(AndroidApplication androidApplication) {
        this.androidApplication = androidApplication;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return androidApplication;
    }

    @Provides
    @Singleton
    InjectClass_2 provideInjectClass2() {
        return new InjectClass_2();
    }
}
