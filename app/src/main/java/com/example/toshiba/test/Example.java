package com.example.toshiba.test;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Example extends AppCompatActivity {
TextView txt;
    Button b1;
    Button b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        txt=(TextView)findViewById(R.id.name);
        b1=(Button)findViewById(R.id.byt);
        b2=(Button)findViewById(R.id.byt1);
        b3=(Button)findViewById(R.id.byt2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Button Clicked");
                txt.setTextColor(Color.BLUE);
            }

        });
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Example.this,Login.class));
        }
    });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Example.this,Todoapp1.class));
            }
        });
    }

}
