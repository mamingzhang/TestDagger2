package com.kinstalk.testdagger2;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mamingzhang on 16/10/9.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);

    Context context();

    InjectClass_2 InjectClass2();

}
