package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class loading extends AppCompatActivity {
    ImageView imageView;
    AnimationDrawable anim;
    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(loading.this, Activity2.class);
                startActivity(i);
                finish();

            }
        }, 6700);

        imageView = (ImageView) findViewById(R.id.imageView);
        if(imageView == null) throw new AssertionError();
        imageView.setBackgroundResource(R.drawable.animation_loading);
        anim = (AnimationDrawable) imageView.getBackground();
        anim.start();
    }
}