package com.example.toshiba.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Firstpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage)
        ;
    }

    public void check1(View view) {
        Toast.makeText(this,"No Furthur Activity",Toast.LENGTH_LONG).show();
    }
}
