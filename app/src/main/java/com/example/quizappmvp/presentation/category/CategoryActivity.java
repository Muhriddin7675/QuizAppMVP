package com.example.quizappmvp.presentation.category;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappmvp.R;
import com.example.quizappmvp.data.model.CategoryEnum;
import com.example.quizappmvp.presentation.info.InfoActivity;
import com.example.quizappmvp.presentation.main.MainActivity;

public class CategoryActivity extends AppCompatActivity implements CategoryContract.View{
    private CategoryContract.Presenter presenter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        presenter =  new CategoryPresenter(this);
        attachView();

        findViewById(R.id.open_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this, InfoActivity.class));
            }
        });

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                new AlertDialog.Builder(CategoryActivity.this,R.style.CustomAlertDialog)
                        .setTitle("Exit")
                        .setMessage("Do you want to exit ? :(")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        };

        this.getOnBackPressedDispatcher().addCallback(this, callback);
    }

    private void attachView() {
    findViewById(R.id.matematika).setOnClickListener(v-> presenter.setSelectCategory(CategoryEnum.MATEMATIKA));
    findViewById(R.id.tarix).setOnClickListener(v-> presenter.setSelectCategory(CategoryEnum.TARIX));
    findViewById(R.id.adabiyot).setOnClickListener(v-> presenter.setSelectCategory(CategoryEnum.ADABIYOT));
    findViewById(R.id.english).setOnClickListener(v-> presenter.setSelectCategory(CategoryEnum.ENGLISH));
    findViewById(R.id.kimyo).setOnClickListener(v-> presenter.setSelectCategory(CategoryEnum.KIMYO));
    findViewById(R.id.fizika).setOnClickListener(v-> presenter.setSelectCategory(CategoryEnum.FIZIKA));
    }

    @Override
    public void openQuestionActivity() {
        startActivity(new Intent(CategoryActivity.this, MainActivity.class));
    }


}