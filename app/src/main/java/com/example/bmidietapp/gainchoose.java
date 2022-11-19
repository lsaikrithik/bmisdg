package com.example.bmidietapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class gainchoose extends AppCompatActivity {

    android.widget.Button mgveg;
    android.widget.Button mgnonveg;
    android.widget.Button mgboth;
    Button back, home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gainchoose);
        getSupportActionBar().hide();
        mgveg=findViewById(R.id.gveg);
        mgnonveg=findViewById(R.id.gnonveg);
        mgboth=findViewById(R.id.both);
        back = (Button) findViewById(R.id.back);
        home = (Button) findViewById(R.id.home);

        mgveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gainchoose.this,gainwtveg.class);
                startActivity(intent);
                finish();

            }
        });
        mgnonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gainchoose.this,gainwtnonveg.class);
                startActivity(intent);
                finish();

            }
        });
        mgboth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gainchoose.this,gainwtboth.class);
                startActivity(intent);
                finish();

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gainchoose.this,choosediet.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gainchoose.this,register.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
