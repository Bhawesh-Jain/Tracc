package com.smtlabs.tracc.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.smtlabs.tracc.databinding.ActivitySplashBinding;
import com.smtlabs.tracc.ui.home.HomeActivity;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int SecondsDelayed = 2;

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
            finish();
        }, SecondsDelayed * 1000 );
    }
}