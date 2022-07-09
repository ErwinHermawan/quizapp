package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mtklist extends AppCompatActivity {
    Button pertambahan, pengurangan, perkalian, pembagian, pangkat;
    Button pertambahan2, pengurangan2, perkalian2, pembagian2, pangkat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtklist);
        pertambahan = findViewById(R.id.pertambahan);
        pertambahan2 = findViewById(R.id.pertambahanvideo);
        pengurangan = findViewById(R.id.pengurangan);
        pengurangan2 = findViewById(R.id.penguranganvideo);
        perkalian = findViewById(R.id.perkalian);
        perkalian2 = findViewById(R.id.perkalianvideo);
        pembagian = findViewById(R.id.pembagian);
        pembagian2 = findViewById(R.id.pembagianvideo);
        pangkat = findViewById(R.id.pangkat);
        pangkat2 = findViewById(R.id.pangkatvideo);

        pertambahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpertambahan.class));
            }
        });
        pertambahan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpertambahanvideo.class));
            }
        });
        pengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpengurangan.class));
            }
        });
        pengurangan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpenguranganvideo.class));
            }
        });
        perkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkperkalian.class));
            }
        });
        perkalian2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkperkalianvideo.class));
            }
        });
        pembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpembagian.class));
            }
        });
        pembagian2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpembagianvideo.class));
            }
        });
        pangkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpangkat.class));
            }
        });
        pangkat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mtklist.this, mtkpangkatvideo.class));
            }
        });

    }

}