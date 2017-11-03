package com.example.alexb.chineserecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BreakfastActivity extends AppCompatActivity {

    private ListView listView;
    private String[] recipeNames;

    public static int[] recipePhotos = {
            R.drawable.breakfastlogoldpi,
            R.drawable.breakfastlogoldpi
    };
    private ArrayList<Recipes> recipes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        recipeNames = getResources().getStringArray(R.array.recipeNames);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,recipeNames);
        listView = (ListView) findViewById(R.id.breakfastListView);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You clicked",Toast.LENGTH_SHORT);
            }
        });
        generateRecipes();
        Toast.makeText(getApplicationContext(),"Loaded page",Toast.LENGTH_SHORT).show();

    }

    private void generateRecipes(){
        for (int i=0;i<recipePhotos.length;i++){
            recipes.add(new Recipes(recipeNames[i],recipePhotos[i]));
        }
    }

}
