package com.example.quizappmvp.presentation.main;

import com.example.quizappmvp.data.model.QuestionData;

import java.util.List;

public class MainPresenter implements MainContract.Presenter{
    private MainContract.Model model;
    private MainContract.View view;
    private List<QuestionData> questionData;
    int currentPos = 0;
    int selectIndex = -1;
    int correctCount = 0;
    int wrongCount = 0;
    public MainPresenter(MainContract.View view) {
        this.view = view;
        model = new MainModel();
        loadQuestionData();
        loadQuestionDataByPos();
    }
    private void loadQuestionData(){
     questionData = model.getQuestionByCategory();
    }
    private void loadQuestionDataByPos( ){
        view.descriptionQuestion(questionData.get(currentPos));

    }

    @Override
    public void selectAnswer(int index) {
    if(index == selectIndex)return;
    if(selectIndex > -1)view.clearOldStates(selectIndex);
    selectIndex = index;

    view.nextButtonStates(true);
    view.showSelectIndex(index);
    }

    @Override
    public void clickNextButton() {
        view.showCount(currentPos);
        QuestionData question = questionData.get(currentPos);
        if(question.getAnswer().equals(question.getVariants()[selectIndex])){
         this.correctCount++;
        }
        else{this.wrongCount++;}
        view.clearOldStates(selectIndex);
        view.nextButtonStates(false);
        currentPos++;

        if(currentPos == questionData.size())view.showResult(correctCount,wrongCount);
        else view.descriptionQuestion(questionData.get(currentPos));
        selectIndex = -1;

    }


    @Override
    public void clickFinishButton() {
    view.showResult(correctCount,wrongCount);
    }
}
