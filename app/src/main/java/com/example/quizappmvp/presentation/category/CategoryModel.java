package com.example.quizappmvp.presentation.category;

import com.example.quizappmvp.data.model.CategoryEnum;
import com.example.quizappmvp.domian.AppController;

public class CategoryModel implements CategoryContract.Model{
    AppController appController = AppController.getIntanse();

    @Override
    public void setSelectCategory(CategoryEnum selectCategory) {
        appController.setCategoryEnum(selectCategory);
    }
}
