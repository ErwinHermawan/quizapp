package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class biologisistemgerak extends AppCompatActivity {
    Button home;
    private int presCounter = 0;
    private int maxpresCounter = 4;
    private String[] keys = {"Otot", "Tulang", "Internet", "Ikat", "Epitel"};
    private String textAnswer = "Internet";
    TextView textScreen, textQuestion, textTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biologisistemgerak);
        home = (Button) findViewById(R.id.textScreen);

        keys = shuffleArray(keys);


        for(String key : keys) {
            addView(((LinearLayout) findViewById(R.id.layoutParent)), key,
                    ((EditText) findViewById(R.id.editText)));
        }
        maxpresCounter = 1;
    }

    private String[] shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--){
            int index = rnd.nextInt(i+1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }
    private void addView(LinearLayout viewParent, final String text, final EditText editText){
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        linearLayoutParams.rightMargin = 30;

        final TextView textView = new TextView(this);

        textView.setLayoutParams(linearLayoutParams);
        textView.setBackground(this.getResources().getDrawable(R.drawable.bgpink));
        textView.setTextColor(this.getResources().getColor(R.color.purple_200));
        textView.setGravity(Gravity.CENTER);
        textView.setText(text);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setTextSize(20);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/Mostery.ttf");

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        textTitle = (TextView) findViewById(R.id.textTitle);

        textQuestion.setTypeface(typeface);
        textScreen.setTypeface(typeface);
        textTitle.setTypeface(typeface);
        editText.setTypeface(typeface);
        textView.setTypeface(typeface);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(presCounter < maxpresCounter){
                    if (presCounter == 0)
                        editText.setText("");
                    editText.setText(editText.getText().toString() + text);
                    textView.animate().alpha(0).setDuration(300);
                    presCounter++;
                    if (presCounter == maxpresCounter)
                        doValidate();



                }

            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biologisistemgerak.this, Activity2.class));
            }
        });

        viewParent.addView(textView);

    }

    private void doValidate(){
        presCounter = 0;
        EditText editText = findViewById(R.id.editText);
        LinearLayout linearLayout = findViewById(R.id.layoutParent);

        if (editText.getText().toString().equals(textAnswer)){
            Toast.makeText(biologisistemgerak.this, "Correct Answer", Toast.LENGTH_SHORT).show();
            editText.setText("");
        } else {
            Toast.makeText(biologisistemgerak.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            editText.setText("");
        }
        keys = shuffleArray(keys);
        linearLayout.removeAllViews();
        for (String key : keys){
            addView(linearLayout, key, editText);
        }

    }
}