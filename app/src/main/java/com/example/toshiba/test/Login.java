package com.example.toshiba.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText ed,ed1;
    String sl,s2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed = (EditText) findViewById(R.id.id1);
        ed1 = (EditText) findViewById(R.id.id2);
        b1=(Button)findViewById(R.id.byt2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);
        AutoCompleteTextView textview = (AutoCompleteTextView) findViewById(R.id.id1);
        AutoCompleteTextView textview1 = (AutoCompleteTextView) findViewById(R.id.id2);
        textview.setAdapter(adapter);
        textview1.setAdapter(adapter);


    }
        private static final String[] names=new String[]{
          "Anurag","Glen","Adarsh","glavin","aldrin","anand","shetty","lobo","rai","saty","satrrey"
        };


    public void check(View v){
        sl=ed.getText().toString();
        s2=ed1.getText().toString();
        Toast.makeText(this,sl+" "+s2+" "+" Registered",Toast.LENGTH_LONG).show();
        startActivity(new Intent(Login.this,Selectpage.class));
    }
}
