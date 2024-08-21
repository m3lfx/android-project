package com.example.listviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String countries[];
    ArrayAdapter<String> adapter;
    Button button, buttonGrid, buttonScroll, buttonWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        button = findViewById(R.id.button);
        buttonGrid = findViewById(R.id.buttonGrid);
        buttonScroll = findViewById(R.id.buttonScroll);
        buttonWeb = findViewById(R.id.buttonWebView);
        countries = getResources().getStringArray(R.array.countries);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String countryName = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), "you selected" + countryName, Toast.LENGTH_LONG).show();
            }

        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(myIntent);
            }
        });

        buttonGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, GridActivity.class);
                startActivity(myIntent);
            }
        });
        buttonScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ScrollViewActivity.class);
                startActivity(myIntent);
            }
        });

        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(myIntent);
            }
        });
    }
}