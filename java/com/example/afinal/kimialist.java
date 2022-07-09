package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kimialist extends AppCompatActivity {
    Button hidrokarbon, minyak, lajureaksi, kalor, kesetimbangan;
    Button hidrokarbon2, minyak2, lajureaksi2, kalor2, kesetimbangan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimialist);
        hidrokarbon = findViewById(R.id.hidrokarbon);
        hidrokarbon2 = findViewById(R.id.hidrokarbonvideo);
        minyak = findViewById(R.id.minyak);
        minyak2 = findViewById(R.id.minyakvideo);
        lajureaksi = findViewById(R.id.lajureaksi);
        lajureaksi2 = findViewById(R.id.lajureaksivideo);
        kalor = findViewById(R.id.kalor);
        kalor2 = findViewById(R.id.kalorvideo);
        kesetimbangan = findViewById(R.id.kesetimbangan);
        kesetimbangan2 = findViewById(R.id.kesetimbanganvideo);

        hidrokarbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiahidrokarbon.class));
            }
        });
        hidrokarbon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiahidrokarbonvideo.class));
            }
        });
        minyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiaminyak.class));
            }
        });
        minyak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiaminyakvideo.class));
            }
        });
        lajureaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimialajureaksi.class));
            }
        });
        lajureaksi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimialajureaksivideo.class));
            }
        });
        kalor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiakalor.class));
            }
        });
        kalor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiakalorvideo.class));
            }
        });
        kesetimbangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiakesetimbangan.class));
            }
        });
        kesetimbangan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kimialist.this, kimiakesetimbanganvideo.class));
            }
        });

    }

}