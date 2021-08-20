package com.example.meterialdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView show_text;
    Button fade_in, fade_out, rotate;
    Animation ffradein, ffradeout, frotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        show_text = findViewById(R.id.show_text);
        fade_in = findViewById(R.id.fade_in);
        fade_out = findViewById(R.id.fade_out);
        rotate = findViewById(R.id.rotate);

        ffradein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
        ffradeout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
        frotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);

        fade_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_text.startAnimation(ffradein);
            }
        });
        fade_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_text.startAnimation(ffradeout);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_text.startAnimation(frotate);
            }
        });
    }
}