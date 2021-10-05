package com.example.gymdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.act_main2);
        Animation fadeAnim = AnimationUtils.loadAnimation(this , R.anim.fade);
        cl.setAnimation(fadeAnim);
        cl.setAlpha((float) 0.8);
    }
}