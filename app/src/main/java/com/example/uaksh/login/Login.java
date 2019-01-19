package com.example.uaksh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText e1,e2;
String a1="Akshay";
String a2="Password";

String user,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1=(EditText)findViewById(R.id.username);
        e2=(EditText)findViewById(R.id.password);


    }

    public void check(View v)
    {

        user=e1.getText().toString();
        password=e2.getText().toString();
     if(user.equals(a1)&&password.equals(a2))
     {
openactivity();

     }
     else
     {
         Toast.makeText(getApplicationContext(), "Invalid username", Toast.LENGTH_LONG).show();

     }
    }
    public void openactivity()
    {
        Intent intent=new Intent(this,second.class);
                startActivity(intent);
    }
}
