package com.example.toshiba.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Thirdpage extends AppCompatActivity {
AutoCompleteTextView av;
    TextView tv;
    Button b1;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);

        av=(AutoCompleteTextView)findViewById(R.id.id3);
        tv=(TextView)findViewById(R.id.id4);
        b1=(Button)findViewById(R.id.b12);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);
        AutoCompleteTextView textview = (AutoCompleteTextView) findViewById(R.id.id3);
        textview.setAdapter(adapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] names3 = new String[]{
                        "Anurag", "Glen", "Adarsh", "glavin", "aldrin"};
                s1 = av.getText().toString();
                s2 = tv.getText().toString();

                    if (s1.matches("Anurag") && s2.matches("Shetty")) {
                        Toast.makeText(Thirdpage.this, "Successfull Login", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Thirdpage.this, Secondpage.class));
                    } else {
                        Toast.makeText(Thirdpage.this, "Invalid Login", Toast.LENGTH_LONG).show();
                    }

            }

        });

    }
    private static final String[] names=new String[]{
            "Anurag","Glen","Adarsh","glavin","aldrin","anand"

    };
}
