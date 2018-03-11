package com.test.cue;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.cue.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySignUpBinding activitySignUpBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);
        activitySignUpBinding.setActivity(this);
    }

    public void onClickSignUp(View view) {
        Intent landingPageIntent = new Intent(this, LandingPageActivity.class);
        startActivity(landingPageIntent);
    }
}
