package com.haicoding.splashscreenanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottie_animation);
        lottieAnimationView.playAnimation();

        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, SecondActivity.class));
            finish();
        }, 3000);
    }
}