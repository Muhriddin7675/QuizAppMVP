package com.example.quizappmvp.presentation.main;

import com.example.quizappmvp.data.model.QuestionData;
import com.example.quizappmvp.domian.AppController;

import java.util.List;

public class MainModel implements MainContract.Model{
AppController appController = AppController.getIntanse();

    @Override
    public List<QuestionData> getQuestionByCategory() {
        return appController.getQuestionByCategory();
    }
}
