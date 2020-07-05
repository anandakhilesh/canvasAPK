package com.example.canvasapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView)findViewById(R.id.webView);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        mywebview.loadUrl("https://localhost/Canvas/index.html");
//        mywebview.loadUrl("http://mycanvas-001.s3-website-us-east-1.amazonaws.com");
//        mywebview.loadUrl("http://localhost:63342/canvas/index.html?_ijt=fh39u7gksn5inqnuf1ivp7sbj1");
        mywebview.loadUrl("https://sharabhsinghi.github.io/canvas/");
        mywebview.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if(mywebview.canGoBack()){
            mywebview.goBack();
        }else{
            super.onBackPressed();
        }
    }
}