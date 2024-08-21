package com.example.listviewapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private ArrayList<String> countryNameList = new ArrayList<>();
    private ArrayList<String> detailsList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        countryNameList.add("USA");
        countryNameList.add("japan");
        countryNameList.add("korea");
        detailsList.add("usa ");
        detailsList.add("japan ");
        detailsList.add("usa");
        imageList.add(R.drawable.profile);
        imageList.add(R.drawable.s1);
        imageList.add(R.drawable.s2);

        adapter = new RecyclerAdapter(countryNameList,detailsList,imageList,RecyclerViewActivity.this);
        recyclerView.setAdapter(adapter);
    }
}