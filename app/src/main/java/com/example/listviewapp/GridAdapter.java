package com.example.listviewapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();
    Context context;

    public GridAdapter(ArrayList<String> text, ArrayList<Integer> image, Context context) {
        this.text = text;
        this.image = image;
        this.context = context;
    }

    @Override
    public int getCount() {
        return text.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder") View gridView  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gridview_layout, viewGroup, false);
        ImageView imageView = gridView.findViewById(R.id.imageView2);
        TextView textView = gridView.findViewById(R.id.textView2);
        imageView.setImageResource(image.get(i));
        textView.setText(text.get(i));
        return gridView;
    }
}
