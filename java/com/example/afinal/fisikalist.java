package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fisikalist extends AppCompatActivity {
    Button rotasi, elastisitas, fluida, kalor, termodinamika;
    Button rotasi2, elastisitas2, fluida2, kalor2, termodinamika2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisikalist);
        rotasi = findViewById(R.id.rotasi);
        rotasi2 = findViewById(R.id.rotasivideo);
        elastisitas = findViewById(R.id.elastisitas);
        elastisitas2 = findViewById(R.id.elastisitasvideo);
        fluida = findViewById(R.id.fluida);
        fluida2 = findViewById(R.id.fluidavideo);
        kalor = findViewById(R.id.kalor);
        kalor2 = findViewById(R.id.kalorvideo);
        termodinamika = findViewById(R.id.termodinamika);
        termodinamika2 = findViewById(R.id.termodinamikavideo);

        rotasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikarotasi.class));
            }
        });
        rotasi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikarotasivideo.class));
            }
        });
        elastisitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikaelastisitas.class));
            }
        });
        elastisitas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikaelastisitasvideo.class));
            }
        });
        fluida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikafluida.class));
            }
        });
        fluida2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikafluidavideo.class));
            }
        });
        kalor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikakalor.class));
            }
        });
        kalor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikakalorvideo.class));
            }
        });
        termodinamika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikatermodinamika.class));
            }
        });
        termodinamika2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(fisikalist.this, fisikatermodinamikavideo.class));
            }
        });

    }

}