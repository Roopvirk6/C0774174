package com.example.c0774174;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Canada> canada;
    private RecyclerView rvPlaceList;
    private CanadaAdapters canadaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RecyclerView
        rvPlaceList = findViewById(R.id.rvRecyclerView);
        populatePlaces();

        canadaAdapter = new CanadaAdapters(canada);
         RecyclerView.LayoutManager laymanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        //GridLayoutManager mGridManager = new GridLayoutManager(this,GridLayoutManager.VERTICAL);
       // GridLayoutManager mGridM = new GridLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvPlaceList.setLayoutManager(laymanager);
        rvPlaceList.setAdapter(canadaAdapter);
    }

        private void populatePlaces()
        {
            canada = new ArrayList<Canada>();
            canada.add(new Canada(1, "CN Tower", "test12344", R.drawable.p1));
            canada.add(new Canada(2, "Canada Wonderlan", "test12344", R.drawable.p2));
            canada.add(new Canada(3, "Toronto museum", "test12344", R.drawable.p3));
            canada.add(new Canada(4, "Brampton", "test12344", R.drawable.p4));
            canada.add(new Canada(5, "missisuga", "test12344", R.drawable.p6));
            canada.add(new Canada(6, "kitchner", "test12344", R.drawable.p7));
            canada.add(new Canada(7, "subway", "test12344", R.drawable.p8));
            canada.add(new Canada(8, "NIggara falls", "test12344", R.drawable.p6));
            canada.add(new Canada(9, "vancouver", "test12344", R.drawable.p1));
            canada.add(new Canada(10, "surrey", "test12344", R.drawable.p8));

        }

    }

