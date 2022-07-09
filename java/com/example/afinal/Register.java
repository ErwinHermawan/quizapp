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

public class Register extends AppCompatActivity {
    EditText editNama, editPassword;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.activity_register);
        editNama=(EditText) findViewById(R.id.Nama);
        editPassword=(EditText) findViewById(R.id.Password);
        Register=(Button) findViewById(R.id.Register);

        Register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Nama = editNama.getText().toString();
                String Password = editPassword.getText().toString();
                startActivity(new Intent(Register.this, MainActivity.class));
                String s = "";
                try{
                    URL url = new URL("https://gravid-slate.000webhostapp.com/EHR/androidlogin.php?Nama="+Nama+
                            "&Password="+Password);
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
                        startActivity(new Intent(Register.this, MainActivity.class));
                    }
                    else{
                        Register.setText(s);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}