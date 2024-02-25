package com.example.quizappmvp.presentation.category;

import com.example.quizappmvp.data.model.CategoryEnum;

public class CategoryPresenter implements CategoryContract.Presenter {
    private CategoryContract.Model model;
    private CategoryContract.View view;

    public CategoryPresenter(CategoryContract.View view) {
        this.view = view;
        model = new CategoryModel();
    }

    @Override
    public void setSelectCategory(CategoryEnum selectCategory) {
        model.setSelectCategory(selectCategory);
        view.openQuestionActivity();
    }
}
