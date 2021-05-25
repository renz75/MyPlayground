package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class LiberiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liberia);

        WebView liberiaView = (WebView) findViewById(R.id.webViewLiberia);
        liberiaView.loadUrl("https://en.wikipedia.org/wiki/Flag_of_Liberia");
    }
}