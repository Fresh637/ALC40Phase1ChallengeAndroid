package com.yottabitconsulting.alc40phase1challenge_android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        webView  = (WebView) findViewById(R.id.about_alc);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().getDomStorageEnabled();
        webView.loadUrl("https://www.andela.com/alc/");

    }


}
