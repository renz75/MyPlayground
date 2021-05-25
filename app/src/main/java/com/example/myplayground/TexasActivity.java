package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class TexasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texas);

        WebView texasView = (WebView) findViewById(R.id.webViewTexas);
        texasView.loadUrl("https://en.wikipedia.org/wiki/Flag_of_Texas");
    }
}