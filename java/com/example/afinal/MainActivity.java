package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {
    EditText editNama, editPassword;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        editNama = findViewById(R.id.Nama);
        editPassword = findViewById(R.id.Password);
        Login = findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = editNama.getText().toString();
                String Password = editPassword.getText().toString();
                startActivity(new Intent(MainActivity.this, loading.class));
                String s = "";
                try{
                    URL url = new URL("https://gravid-slate.000webhostapp.com/EHR/androidregister.php?Nama="
                            +Nama+"&Password="+Password);
                    URLConnection ucon = url.openConnection();
                    InputStream in = ucon.getInputStream();
                    InputStreamReader isw = new InputStreamReader(in);
                    int data = isw.read();
                    while(data!= -1){
                        char current = (char) data;
                        s= s+current;
                        data = isw.read();
                    }
                    if(s.equals("Success")) {
                        startActivity(new Intent(MainActivity.this, Activity2.class));
                    }



                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });


    }

    public void Register(View view) {
        startActivity(new Intent(MainActivity.this, Register.class));
    }
}