package com.adrossoftware.myrecipes.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.adrossoftware.myrecipes.R;
import com.adrossoftware.myrecipes.models.RecipeModel;

import java.util.ArrayList;
import java.util.List;

public class RecipeAdapter extends BaseAdapter {

    private Context context;
    private List<RecipeModel> recipes = new ArrayList<RecipeModel>();

    public RecipeAdapter() {}

    public RecipeAdapter(Context context, ArrayList<RecipeModel> recipes) {
        this.context = context;
        this.recipes = recipes;
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public Object getItem(int i) {
        return recipes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return recipes.indexOf(i);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final TextView lblTitle;
        final TextView lblDescription;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.recipe_item, null);
            lblTitle = view.findViewById(R.id.lblTitle);
            lblDescription = view.findViewById(R.id.lblDescription);
            RecipeModel recipe = (RecipeModel) getItem(i);
            lblTitle.setText(recipe.getTitle());
            lblDescription.setText(recipe.getDescription());
        }
        return view;
    }
}
