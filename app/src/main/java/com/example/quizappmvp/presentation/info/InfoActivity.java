package com.example.quizappmvp.presentation.info;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappmvp.R;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        findViewById(R.id.back_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.dispatcher).setOnClickListener(v->{
            openTelegram();
        });
    }
    @SuppressLint("QueryPermissionsNeeded")
    public void openTelegram() {
        Uri telegramUri = Uri.parse("https://t.me/muhriddin7675");
        Intent intent = new Intent(Intent.ACTION_VIEW, telegramUri);

        if (intent.resolveActivity(this.getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, telegramUri);
            startActivity(webIntent);
        }
    }
}