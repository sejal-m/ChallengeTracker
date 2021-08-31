package com.example.challegetracker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.stream.IntStream;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MainActivity extends AppCompatActivity {
    GridView challenge_grid;
    int[] days = new int[100];
    int checked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populate(days); //populate array with 1-100
        challenge_grid = findViewById(R.id.challengeContainer); // initialising the gridview

        // Create an object of CustomAdapter and set Adapter to GirdView
        GridAdapter gridAdapter = new GridAdapter(this, days);
        challenge_grid.setAdapter(gridAdapter);

        challenge_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                TextView current_day = (TextView) v.findViewById(R.id.day_number);
                current_day.setBackgroundColor(Color.parseColor("#9FE554"));

            }
        });
    }

    public void populate(int[] a) {
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
    }
}