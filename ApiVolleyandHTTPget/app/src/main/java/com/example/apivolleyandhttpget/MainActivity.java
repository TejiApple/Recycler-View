package com.example.apivolleyandhttpget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList; 
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    ArrayList alContent = new ArrayList<>(Arrays.asList("Content 1","Content 2","Content 3","Content 4","Content 5"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);


    }
}