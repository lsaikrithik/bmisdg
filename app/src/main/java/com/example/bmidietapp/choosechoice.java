package com.example.bmidietapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class choosechoice extends AppCompatActivity {

    android.widget.Button mveg;
    android.widget.Button mnonveg;
    android.widget.Button mboth;
    Button back, home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosechoice);
        getSupportActionBar().hide();
        mveg=findViewById(R.id.veg);
        mnonveg=findViewById(R.id.nonveg);
        mboth=findViewById(R.id.both);
        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);

        mveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosechoice.this,loosewtveg.class);
                startActivity(intent);
                finish();
            }
        });
        mnonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosechoice.this,loosewtnonveg.class);
                startActivity(intent);
                finish();
            }
        });
        mboth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosechoice.this,loosewtboth.class);
                startActivity(intent);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosechoice.this,choosediet.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(choosechoice.this,register.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
