package com.example.kamath.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    EditText e1, e2;
    String Username = "HP";
    String Password = "1234";
    String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        e1 = (EditText) findViewById(R.id.Username);
        e2 = (EditText) findViewById(R.id.Password);
    }

    public void login(View v) {
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();
        if (s1.matches(Username) && s2.matches(Password)) {
            Toast.makeText(this, "correct",Toast.LENGTH_LONG).show();
            //next page
            Intent in=new Intent(this,secondpage.class);
            startActivity(in);
        } else {
            Toast.makeText(this, "wrong username or password", Toast.LENGTH_LONG).show();
        }
    }

}