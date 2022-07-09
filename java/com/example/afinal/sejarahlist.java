package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sejarahlist extends AppCompatActivity {
    Button kolonialisme, kerajaanhindu, kerajaanbuddha, kerajaanislam, kemerdekaanindonesia;
    Button kolonialisme2, kerajaanhindu2, kerajaanbuddha2, kerajaanislam2, kemerdekaanindonesia2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarahlist);
        kolonialisme = findViewById(R.id.kolonialisme);
        kolonialisme2 = findViewById(R.id.kolonialismevideo);
        kerajaanhindu = findViewById(R.id.kerajaanhindu);
        kerajaanhindu2 = findViewById(R.id.kerajaanhinduvideo);
        kerajaanbuddha = findViewById(R.id.kerajaanbuddha);
        kerajaanbuddha2 = findViewById(R.id.kerajaanbuddhavideo);
        kerajaanislam = findViewById(R.id.kerajaanislam);
        kerajaanislam2 = findViewById(R.id.kerajaanislamvideo);
        kemerdekaanindonesia = findViewById(R.id.kemerdekaanindonesia);
        kemerdekaanindonesia2 = findViewById(R.id.kemerdekaanindonesiavideo);

        kolonialisme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkolonialisme.class));
            }
        });
        kolonialisme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkolonialismevideo.class));
            }
        });
        kerajaanhindu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkerajaanhindu.class));
            }
        });
        kerajaanhindu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkerajaanhinduvideo.class));
            }
        });
        kerajaanbuddha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkerajaanbuddha.class));
            }
        });
        kerajaanbuddha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkerajaanbuddhavideo.class));
            }
        });
        kerajaanislam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkerajaanislam.class));
            }
        });
        kerajaanislam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkerajaanislamvideo.class));
            }
        });
        kemerdekaanindonesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkemerdekaanindonesia.class));
            }
        });
        kemerdekaanindonesia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sejarahlist.this, sejarahkemerdekaanindonesiavideo.class));
            }
        });

    }

}