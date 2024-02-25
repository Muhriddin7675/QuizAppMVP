package com.example.quizappmvp.presentation.category;

import com.example.quizappmvp.data.model.CategoryEnum;

public interface CategoryContract {
    interface Model{
        void setSelectCategory(CategoryEnum selectCategory);

    }
    interface View{
        void openQuestionActivity();

    }
    interface Presenter{
        void setSelectCategory(CategoryEnum selectCategory);
    }
}
