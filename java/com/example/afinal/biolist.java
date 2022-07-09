package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class biolist extends AppCompatActivity {
    Button sel, jaringan, sistemgerak,sirkulasi, pencernaan;
    Button sel2, jaringan2, sistemgerak2, sirkulasi2, pencernaan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biolist);
        sel = findViewById(R.id.sel);
        sel2 = findViewById(R.id.selvideo);
        jaringan = findViewById(R.id.jaringan);
        jaringan2 = findViewById(R.id.jaringanvideo);
        sistemgerak = findViewById(R.id.sistemgerak);
        sistemgerak2 = findViewById(R.id.sistemgerakvideo);
        sirkulasi = findViewById(R.id.sistemsirkulasi);
        sirkulasi2 = findViewById(R.id.sistemsirkulasivideo);
        pencernaan = findViewById(R.id.sistempencernaan);
        pencernaan2 = findViewById(R.id.sistempencernaanvideo);

        sel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologisel.class));
            }
        });
        sel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologiselvideo.class));
            }
        });
        jaringan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologijaringan.class));
            }
        });
        jaringan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologijaringanvideo.class));
            }
        });
        sistemgerak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologisistemgerak.class));
            }
        });
        sistemgerak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologisistemgerakvideo.class));
            }
        });
        sirkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologisistemsirkulasi.class));
            }
        });
        sirkulasi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologisistemsirkulasivideo.class));
            }
        });
        pencernaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologisistempencernaan.class));
            }
        });
        pencernaan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(biolist.this, biologisistempencernaanvideo.class));
            }
        });

    }

}