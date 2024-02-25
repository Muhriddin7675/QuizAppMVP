package com.example.quizappmvp.presentation.splesh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappmvp.R;
import com.example.quizappmvp.presentation.category.CategoryActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);

        Handler handler = new Handler();
         handler.postDelayed(() -> {
             startActivity(new Intent(SplashActivity.this, CategoryActivity.class));
             finish();
         },1_000);
    }
}
