package com.example.alexb.chineserecipes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alexb on 02/11/2017.
 */

public class RecipesAdapter extends ArrayAdapter<Recipes> {

    private int resource;
    private ArrayList<Recipes> recipes;
    private Context context;

    public RecipesAdapter(Context context,int resource,ArrayList<Recipes> recipes){
        super(context,resource,recipes);
        this.resource=resource;
        this.recipes=recipes;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        try{
            if(v==null){
                LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = layoutInflater.inflate(resource, parent,
                        false
                );
            }
            ImageView imageView = (ImageView) v.findViewById(R.id.recipeListRowImage);
            TextView textViewName = (TextView) v.findViewById(R.id.recipeListRowImage);
            imageView.setImageResource(recipes.get(position).getRecipePhoto());
            textViewName.setText(recipes.get(position).getRecipeName());
        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return v;
    }

}
