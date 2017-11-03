package com.example.alexb.chineserecipes;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

/**
 * Created by alexb on 01/11/2017.
 */

public class Recipes {
    private String recipeName;
    private int recipePhoto;

    public Recipes(String recipeName,int recipePhoto){
        this.recipeName = recipeName;
        this.recipePhoto = recipePhoto;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getRecipePhoto() {
        return recipePhoto;
    }

    public void setRecipePhoto(int recipePhoto) {
        this.recipePhoto = recipePhoto;
    }
}
