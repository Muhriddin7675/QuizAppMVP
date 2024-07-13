package com.example.quizappmvp.presentation.win;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappmvp.R;
import com.example.quizappmvp.presentation.main.MainActivity;

import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;

public class WinActivity extends AppCompatActivity {

    @SuppressLint({"ResourceAsColor", "SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        int correctAnswer = getIntent().getIntExtra("correct", 0);
        ((TextView) findViewById(R.id.corrent)).setText(correctAnswer+"");

        int wrong = getIntent().getIntExtra("wrong", 0);
        ((TextView) findViewById(R.id.wrong)).setText(wrong+"");

        int foiz = correctAnswer * 10;
        CircularProgressIndicator circularProgress = findViewById(R.id.circular_progress);
        circularProgress.setMaxProgress(100);
        circularProgress.setCurrentProgress(foiz);
        circularProgress.setProgress(foiz, 100);

        ((TextView) findViewById(R.id.text_foiz)).setText(foiz + "%");
        ((TextView) findViewById(R.id.paracent)).setText(foiz + "%");
//        if (foiz >= 60) {
//            ((TextView) findViewById(R.id.text_foiz)).setTextColor(Color.parseColor("#04A394"));
//            circularProgress.setDotColor(Color.parseColor("#04A394"));
//            circularProgress.setProgressColor(Color.parseColor("#04A394"));
//        }
        findViewById(R.id.menu).setOnClickListener(v -> finish());
        findViewById(R.id.restart).setOnClickListener(v -> {
            startActivity(new Intent(WinActivity.this, MainActivity.class));
            finish();
        });
    }

}