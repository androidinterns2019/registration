package com.example.toshiba.test;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView texthead;
    private static int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        texthead=(TextView)findViewById(R.id.texthead);
        texthead.setPaintFlags(texthead.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void
            run(){
                startActivity(new Intent(Welcome.this,Example.class));
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
