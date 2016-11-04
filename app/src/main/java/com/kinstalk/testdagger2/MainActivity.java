package com.kinstalk.testdagger2;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    InjectClass_1 injectClass1;
    @Inject
    InjectClass_1 injectClass2;

    @Inject
    InjectClass_2 injectClass21;
    @Inject
    InjectClass_2 injectClass22;

    @Inject
    Context applicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((AndroidApplication)getApplication()).getApplicationComponent().inject(this);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().applicationComponent(((AndroidApplication)getApplication()).getApplicationComponent())
                .activityModule(new ActivityModule()).build();

        injectClass21.LogMsg();
        injectClass22.LogMsg();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                injectClass1.LogMsg();
                injectClass2.LogMsg();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

}
