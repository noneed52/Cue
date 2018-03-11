package com.test.cue;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.cue.databinding.ActivityCueHistoryBinding;

public class CueHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCueHistoryBinding activityCueHistoryBinding = DataBindingUtil.setContentView(this, R.layout.activity_cue_history);
        activityCueHistoryBinding.setActivity(this);
    }

    public void onClickCueCardData(View view) {
        Intent contentPageCue = new Intent(this, TodayCueActivity.class);
        startActivity(contentPageCue);
    }
}
