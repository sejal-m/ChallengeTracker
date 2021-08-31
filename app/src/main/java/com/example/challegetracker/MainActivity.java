package com.example.challegetracker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

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
    TextView day_number;
    int[] days = new int[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populate(days); //populate array with 1-100
        challenge_grid = findViewById(R.id.challengeContainer); // initialising the gridview

        // Create an object of CustomAdapter and set Adapter to GirdView
        GridAdapter gridAdapter = new GridAdapter(this, days);
        challenge_grid.setAdapter(gridAdapter);

    }

    public void populate(int[] a) {
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
    }
}