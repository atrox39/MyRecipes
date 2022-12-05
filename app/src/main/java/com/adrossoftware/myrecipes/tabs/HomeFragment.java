package com.adrossoftware.myrecipes.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.adrossoftware.myrecipes.R;
import com.adrossoftware.myrecipes.adapters.RecipeAdapter;
import com.adrossoftware.myrecipes.models.RecipeModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ArrayList<RecipeModel> recipes;
    private ListView lvRecipes;
    private View root;

    public HomeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_home, container, false);
        lvRecipes = root.findViewById(R.id.lvRecipes);
        recipes = new ArrayList<RecipeModel>();
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        lvRecipes.setAdapter(new RecipeAdapter(root.getContext(), recipes));
    }
}