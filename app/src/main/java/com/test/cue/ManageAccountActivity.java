package com.test.cue;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.cue.databinding.ActivityManageAccountBinding;

public class ManageAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManageAccountBinding activityManageAccountBinding = DataBindingUtil.setContentView(this, R.layout.activity_manage_account);
        activityManageAccountBinding.setActivity(this);
    }
}
