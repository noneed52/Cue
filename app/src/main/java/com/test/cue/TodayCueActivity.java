package com.test.cue;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.cue.databinding.ActivityTodayCueBinding;

public class TodayCueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTodayCueBinding activityTodayCueBinding = DataBindingUtil.setContentView(this, R.layout.activity_today_cue);
        activityTodayCueBinding.setActivity(this);
    }
}
