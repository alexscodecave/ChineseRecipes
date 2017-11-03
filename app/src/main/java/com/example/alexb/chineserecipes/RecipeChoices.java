package com.example.alexb.chineserecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecipeChoices extends AppCompatActivity {

    private Button btnBreakfast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_choices);

        btnBreakfast = (Button) findViewById(R.id.btnBreakfast);

        btnBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToRecipeChoices = new Intent(RecipeChoices.this,BreakfastActivity.class);
                startActivity(goToRecipeChoices);
            }
        });
    }
}
