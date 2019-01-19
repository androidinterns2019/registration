package com.example.hp.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
String user="shreeya";
String pass="1998";
String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.user);
        e2=(EditText)findViewById(R.id.pass);
    }
    public void Login(View v)
    {
        s1=e1.getText().toString();
        s2=e2.getText().toString();
        if(s1.matches(user)&&s2.matches(pass))
        {
            Toast.makeText(this,"correct",Toast.LENGTH_LONG).show();
            Intent in=new Intent(this,secondpage.class);
            startActivity(in);

        }
        else
        {
            Toast.makeText(this,"wrong username or password",Toast.LENGTH_LONG).show();
        }
    }
}
