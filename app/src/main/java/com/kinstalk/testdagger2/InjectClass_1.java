package com.kinstalk.testdagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by mamingzhang on 16/10/12.
 */
@Singleton
public class InjectClass_1 {

    @Inject
    public InjectClass_1() {
        Log.e("mmz", "InjectMsg 1 constuctor");

    }

    public void LogMsg() {
        Log.e("mmz", "InjectMsg 1 LogMsg");
    }
}
