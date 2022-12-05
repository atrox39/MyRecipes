package com.adrossoftware.myrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.adrossoftware.myrecipes.tabs.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private int fragmentPosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.flMain) != null) {
            if (savedInstanceState != null) {
                return;
            }
            getSupportFragmentManager().beginTransaction().add(R.id.flMain, new HomeFragment()).commit();
        }
    }

    private void Change(int i) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        if (fragmentPosition != i) {
            switch (i) {
                case 0: {
                    fragmentTransaction.replace(R.id.flMain, new HomeFragment()).commit();
                    break;
                }
                case 1: {
                    fragmentTransaction.replace(R.id.flMain, new HomeFragment()).commit();
                    break;
                }
            }
        }
    }
}