package com.test.cue;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.cue.databinding.ActivityMyStatsBinding;

public class MyStatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMyStatsBinding activityMyStatsBinding = DataBindingUtil.setContentView(this, R.layout.activity_my_stats);
        activityMyStatsBinding.setActivity(this);
    }

    public void onClickCueCardHistory(View view) {
        Intent cueCardHistoryIntent = new Intent(this, CueHistoryActivity.class);
        startActivity(cueCardHistoryIntent);
    }
}
