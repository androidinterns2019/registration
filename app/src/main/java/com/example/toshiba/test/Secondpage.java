package com.example.toshiba.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Secondpage extends AppCompatActivity {
 WebView vw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        vw=(WebView)findViewById(R.id.web12);
        vw.getSettings().setJavaScriptEnabled(true);
        vw.setWebViewClient(new WebViewClient());
        vw.loadUrl("https://google.com");
    }
}
