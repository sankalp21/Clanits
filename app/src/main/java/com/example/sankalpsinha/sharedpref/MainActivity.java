package com.example.sankalpsinha.sharedpref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    AnimationDrawable animationDrawable;
    RelativeLayout mylay;
    Animation animBounce;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylay=(RelativeLayout)findViewById(R.id.mylay);
        Handler handler=new Handler();
        animationDrawable=(AnimationDrawable) mylay.getBackground();
        animationDrawable.setEnterFadeDuration(700);
        animationDrawable.setExitFadeDuration(700);
        imageView=(ImageView)findViewById(R.id.img);
        animBounce= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        animationDrawable.start();

        imageView.startAnimation(animBounce);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        },5500);


    }
}
