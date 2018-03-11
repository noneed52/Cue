package com.test.cue;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.test.cue.databinding.ActivityRescheduleBinding;

public class RescheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRescheduleBinding activityRescheduleBinding = DataBindingUtil.setContentView(this, R.layout.activity_reschedule);
        activityRescheduleBinding.setActivity(this);
    }

    public void onClickReschedule(View view) {
        Toast.makeText(this, "Reschedule successful", Toast.LENGTH_SHORT).show();
    }
}
