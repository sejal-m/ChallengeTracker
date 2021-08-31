package com.example.challegetracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] days;
    LayoutInflater inflater;
    public GridAdapter(Context applicationContext, int[] days) {
        this.context = applicationContext;
        this.days = days;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return days.length;
    }
    @Override
    public Object getItem(int i) {
        return days[i];
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_gridview, null); // inflate the layout
        TextView number_view = view.findViewById(R.id.day_number); // get the reference of ImageView
        number_view.setText(String.valueOf(days[i])); // set logo images
        return view;


    }
}