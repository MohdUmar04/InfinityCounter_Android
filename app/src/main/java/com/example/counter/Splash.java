package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent home=new Intent(Splash.this, MainActivity.class);

//        Animation fadeIn = new AlphaAnimation(1,0);
//        fadeIn.setInterpolator(new DecelerateInterpolator());
//        fadeIn.setDuration(5000);
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView logo = findViewById(R.id.logoTransparent);

//        logo.startAnimation(fadeIn);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish();
            }
        },2000);

    }
}