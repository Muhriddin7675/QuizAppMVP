package com.example.quizappmvp.presentation.win;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappmvp.R;

public class WinActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        int correctAnswer = getIntent().getIntExtra("correct",0);
        ((TextView)findViewById(R.id.corrent)).setText("Correct answers : " + correctAnswer);

        int wrong = getIntent().getIntExtra("wrong",0);
        ((TextView)findViewById(R.id.wrong)).setText("Wrong answers : " + wrong);

        int foiz = correctAnswer*10;
        ((TextView)findViewById(R.id.foiz)).setText(foiz+"%");
         if(foiz >=60){
             ((TextView)findViewById(R.id.foiz)).setTextColor(Color.GREEN);
         }
        findViewById(R.id.menu).setOnClickListener(v-> finish());
    }
}