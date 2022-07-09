package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button mtk, fisika, indonesia, biologi, kimia, sejarah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        mtk = findViewById(R.id.matematika);
        fisika = findViewById(R.id.fisika);
        indonesia = findViewById(R.id.bi);
        biologi = findViewById(R.id.bio);
        kimia = findViewById(R.id.kimia);
        sejarah = findViewById(R.id.sejarah);

        mtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, mtklist.class));
            }
        });

        fisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, fisikalist.class));
            }
        });

        kimia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, kimialist.class));
            }
        });

        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, sejarahlist.class));
            }
        });

        biologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, biolist.class));
            }
        });

        indonesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, indonesialist.class));
            }
        });
    }
}