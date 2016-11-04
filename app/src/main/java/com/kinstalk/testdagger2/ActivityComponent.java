package com.kinstalk.testdagger2;

import android.app.Activity;

import dagger.Component;

/**
 * Created by mamingzhang on 16/10/12.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

}
