package com.TechRC.facttech;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
    public static int splash_time= 4000;


    ImageView imageView1;

    LottieAnimationView lottieAnimationView;

    Animation top1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);

        imageView1 = findViewById(R.id.imageView1);

        lottieAnimationView = findViewById(R.id.loding);


        top1 =AnimationUtils.loadAnimation(this, R.anim.top1);

        imageView1.setAnimation(top1);

        imageView1.animate().translationY(-1400).setDuration(1280).setStartDelay(3200);

        lottieAnimationView.animate().translationY(1400).setDuration(1280).setStartDelay(3500);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,Appintro.class);
                startActivity(intent);
                finish();
            }
        },splash_time);
    }
}