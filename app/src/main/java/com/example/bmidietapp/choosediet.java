package com.example.bmidietapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class choosediet extends AppCompatActivity {

    android.widget.Button mlooseweight;
    android.widget.Button mgainweight;
    Button back, home;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosediet);
        getSupportActionBar().hide();
        mlooseweight=findViewById(R.id.looseweight);
        mgainweight=findViewById(R.id.gainweight);
        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);

        mlooseweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choosediet.this,choosechoice.class);
                startActivity(intent);
                finish();
            }
        });
        mgainweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choosediet.this,gainchoose.class);
                startActivity(intent);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosediet.this,register.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosediet.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
