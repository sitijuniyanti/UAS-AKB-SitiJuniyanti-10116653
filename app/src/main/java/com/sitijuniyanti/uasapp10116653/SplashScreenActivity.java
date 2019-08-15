package com.sitijuniyanti.uasapp10116653;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sitijuniyanti.uasapp10116653.SharedPreferences.LoginActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private int waktu_loading=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent login = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(login);
                finish();
            }
        }, waktu_loading);
    }
}
