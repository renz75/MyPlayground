package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ChileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chile);

        WebView chileView = (WebView) findViewById(R.id.webViewChile);
        chileView.loadUrl("https://en.wikipedia.org/wiki/Flag_of_Chile");
    }
}