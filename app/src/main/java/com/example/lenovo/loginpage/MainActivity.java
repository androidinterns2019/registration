package com.example.lenovo.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    EditText e1,e2;
    String user="vishruth";
    String pass="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.user);
        e2=(EditText)findViewById(R.id.pass);
    }
    public void login(View v)
    {
        String s1=e1.getText().toString();
        String s2=e2.getText().toString();
        if(s1.equals(user)&&s2.equals(pass))
        {
            Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show();
            Intent in=new Intent(this,SecondPage.class);
            startActivity(in);
        }
        else
        {
            Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
        }
    }

}
