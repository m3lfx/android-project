package com.example.listviewapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid);
        gridView = findViewById(R.id.gridView);
        fillArray();
        GridAdapter adapter = new GridAdapter(text, image, this);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridActivity.this, "you selected" + text.get(i), Toast.LENGTH_LONG).show();
            }
        });

    }
    public void fillArray() {
        text.add("fog");
        text.add("fo0");
        text.add("bar");
        text.add("fog");
        text.add("fog");
        text.add("fog");
        text.add("fog");
        text.add("fog");

        image.add(R.drawable.s1);
        image.add(R.drawable.s2);
        image.add(R.drawable.lto1);
        image.add(R.drawable.lto2);
        image.add(R.drawable.lto3);
        image.add(R.drawable.lto4);
        image.add(R.drawable.lto4);
        image.add(R.drawable.lto6);

    }


}