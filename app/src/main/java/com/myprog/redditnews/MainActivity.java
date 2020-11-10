package com.myprog.redditnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import newslistscreen.NewsListScreenView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment mainFragment = fragmentManager.findFragmentById(R.id.activity_main);
        if (mainFragment == null) {
            mainFragment = new NewsListScreenView();
            fragmentManager.beginTransaction().add(R.id.activity_main, mainFragment).commit();
        }
    }
}