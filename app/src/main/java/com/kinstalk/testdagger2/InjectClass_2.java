package com.kinstalk.testdagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by mamingzhang on 16/10/12.
 */
public class InjectClass_2 {

    @Inject
    public InjectClass_2() {
        Log.e("mmz", "InjectMsg 2 constuctor");

    }

    public void LogMsg() {
        Log.e("mmz", "InjectMsg 2 LogMsg");
    }
}
