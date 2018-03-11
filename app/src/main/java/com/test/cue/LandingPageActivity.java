package com.test.cue;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.cue.databinding.ActivityLandingPageBinding;

public class LandingPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLandingPageBinding activityLandingPageBinding = DataBindingUtil.setContentView(this, R.layout.activity_landing_page);
        activityLandingPageBinding.setActivity(this);
    }

    public void onClickManageAccount(View view) {
        Intent manageAccountIntent = new Intent(this, ManageAccountActivity.class);
        startActivity(manageAccountIntent);
    }

    public void onClickMyStats(View view) {
        Intent myStatsIntent = new Intent(this, MyStatsActivity.class);
        startActivity(myStatsIntent);
    }

    public void onClickTodayCue(View view) {
        Intent todayCueIntent = new Intent(this, TodayCueActivity.class);
        startActivity(todayCueIntent);
    }

    public void onClickReschedule(View view) {
        Intent rescheduleIntent = new Intent(this, RescheduleActivity.class);
        startActivity(rescheduleIntent);
    }
}
