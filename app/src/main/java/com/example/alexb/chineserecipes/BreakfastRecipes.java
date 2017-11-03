package com.example.alexb.chineserecipes;

import android.media.Image;

/**
 * Created by alexb on 31/10/2017.
 */

public class BreakfastRecipes {
    private String recipeName;
    private int recipeImage;

    public String getRecipeName(){
        return recipeName;
    }

    public void setRecipeName(String recipeName){
        this.recipeName=recipeName;
    }

    public int getRecipeImage(){
        return recipeImage;
    }

    public void setRecipeImage(int recipeImage){
        this.recipeImage=recipeImage;
    }
}
