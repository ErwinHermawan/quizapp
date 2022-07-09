package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class indonesialist extends AppCompatActivity {
    Button kausalitas, cerpen, prosedur,drama, surat;
    Button kausalitas2, cerpen2, prosedur2, drama2, surat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indonesialist);
        kausalitas = findViewById(R.id.kausalitas);
        kausalitas2 = findViewById(R.id.kausalitasvideo);
        cerpen = findViewById(R.id.cerpen);
        cerpen2 = findViewById(R.id.cerpenvideo);
        prosedur = findViewById(R.id.prosedur);
        prosedur2 = findViewById(R.id.prosedurvideo);
        drama = findViewById(R.id.drama);
        drama2 = findViewById(R.id.dramavideo);
        surat = findViewById(R.id.surat);
        surat2 = findViewById(R.id.suratvideo);

        kausalitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiakausalitas.class));
            }
        });
        kausalitas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiakausalitasvideo.class));
            }
        });
        cerpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiacerpen.class));
            }
        });
        cerpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiacerpenvideo.class));
            }
        });
        prosedur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiaprosedur.class));
            }
        });
        prosedur2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiaprosedurvideo.class));
            }
        });
        drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiadrama.class));
            }
        });
        drama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiadramavideo.class));
            }
        });
        surat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiasurat.class));
            }
        });
        surat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(indonesialist.this, indonesiasuratvideo.class));
            }
        });

    }

}