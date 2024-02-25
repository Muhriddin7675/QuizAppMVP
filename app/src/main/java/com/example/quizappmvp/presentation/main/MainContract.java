package com.example.quizappmvp.presentation.main;

import com.example.quizappmvp.data.model.QuestionData;

import java.util.List;

public interface MainContract {
    interface Model{
    List<QuestionData> getQuestionByCategory();
    }
    interface View{
        void clearOldStates(int pos);
        void nextButtonStates(boolean bool);
        void descriptionQuestion(QuestionData data);
        void showSelectIndex(int index);
        void showResult(int correctCount, int wrongCount);
        void showCount(int count);

    }
    interface Presenter{
        void selectAnswer(int index);
        void clickNextButton();

        void clickFinishButton();


    }
}
