package com.example.alexb.chineserecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class LunchActivity extends AppCompatActivity {

    private ListView listView;
    private String[] lunchRecipeNames;

    public static int[] lunchRecipePhotos = {
            R.drawable.breakfastlogoldpi,
            R.drawable.breakfastlogoldpi
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
    }
}
