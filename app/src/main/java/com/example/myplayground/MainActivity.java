package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonLiberia, buttonTexas, buttonChile, buttonHint;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLiberia = (Button) findViewById(R.id.buttonLiberia);
        buttonLiberia.setOnClickListener(this);

        buttonTexas = (Button) findViewById(R.id.buttonTexas);
        buttonTexas.setOnClickListener(this);

        buttonChile = (Button) findViewById(R.id.buttonChile);
        buttonChile.setOnClickListener(this);

        buttonHint = (Button) findViewById(R.id.buttonHint);
        buttonHint.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonLiberia:
                Intent l;
                l = new Intent(this,LiberiaActivity.class);
                startActivity(l);
                break;
            case R.id.buttonTexas:
                Intent tx;
                tx = new Intent(this,TexasActivity.class);
                startActivity(tx);
                break;
            case R.id.buttonChile:
                Intent ch;
                ch = new Intent(this,ChileActivity.class);
                startActivity(ch);
                break;
            case R.id.buttonHint:
                Intent h;
                h = new Intent(this, HintActivity.class);
                startActivity(h);
                break;

        }

    }
}