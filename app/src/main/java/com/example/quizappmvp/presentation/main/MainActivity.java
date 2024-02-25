package com.example.quizappmvp.presentation.main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizappmvp.R;
import com.example.quizappmvp.data.model.QuestionData;
import com.example.quizappmvp.presentation.win.WinActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements MainContract.View{
private MainContract.Presenter presenter;
    private List<ViewGroup> groupsVariant;
    private List<ImageView> images;
    private List<TextView> texts;
    private TextView textQuestion;
    private Button btnFinish;
    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadView();
        presenter = new MainPresenter(this);

    }
    private void loadView(){
        textQuestion = findViewById(R.id.text_question);
        btnNext = findViewById(R.id.buttonNext);
        btnFinish = findViewById(R.id.finish);

        groupsVariant = new ArrayList<>();
        groupsVariant.add(findViewById(R.id.variant_1));
        groupsVariant.add(findViewById(R.id.variant_2));
        groupsVariant.add(findViewById(R.id.variant_3));
        groupsVariant.add(findViewById(R.id.variant_4));

        images = new ArrayList<>();
       images.add(findViewById(R.id.image_variant_1));
       images.add(findViewById(R.id.image_variant_2));
       images.add(findViewById(R.id.image_variant_3));
       images.add(findViewById(R.id.image_variant_4));

       texts = new ArrayList<>();
       texts.add(findViewById(R.id.text_varitant_1));
       texts.add(findViewById(R.id.text_varitant_2));
        texts.add(findViewById(R.id.text_varitant_3));
        texts.add(findViewById(R.id.text_varitant_4));

        for (int i = 0; i < groupsVariant.size(); i++) {
            int index = i;
            groupsVariant.get(i).setOnClickListener(v -> presenter.selectAnswer(index));
        }
        findViewById(R.id.back).setOnClickListener(v -> {
          new AlertDialog.Builder(this)
                  .setTitle("Exit")
                  .setMessage("Do you want to exit ?")
                  .setNegativeButton("No", (dialog, which) -> {})
                  .setPositiveButton("Yes", (dialog, which) -> { finish();})
                  .create().show();
        });

        btnNext.setOnClickListener(v-> presenter.clickNextButton());
        btnFinish.setOnClickListener(v-> {
            new AlertDialog.Builder(this)
                    .setTitle("Finish")
                    .setMessage("Do you want to finish ?")
                    .setNegativeButton("No", (dialog, which) -> {})
                    .setPositiveButton("Yes", (dialog, which) -> { presenter.clickFinishButton();})
                    .create().show();

        });

     }

    @SuppressLint("ResourceAsColor")
    @Override

    public void clearOldStates(int pos) {
    images.get(pos).setImageResource(R.drawable.un_check);
    findViewById(R.id.buttonNext).setBackgroundResource(R.drawable.my_color);
    }

    @Override
    public void nextButtonStates(boolean bool) {btnNext.setEnabled(bool);}

    @Override
    public void descriptionQuestion(QuestionData data) {
     textQuestion.setText(data.getQuestion());
        for (int i = 0; i < texts.size(); i++) {
          texts.get(i).setText(data.getVariants()[i]);
        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void showSelectIndex(int index) {
    images.get(index).setImageResource(R.drawable.check);
    findViewById(R.id.buttonNext).setBackgroundResource(R.drawable.my_color_2);
    }

    @Override
    public void showResult(int correctCount, int wrongCount) {
        Intent intent = new Intent(MainActivity.this, WinActivity.class);
        intent.putExtra("correct", correctCount);
        intent.putExtra("wrong", wrongCount);
        startActivity(intent);
        finish();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void showCount(int count) {
        ((TextView)findViewById(R.id.variantNumber)).setText((count+2) + "/10" );
    }

}