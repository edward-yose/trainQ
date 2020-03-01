package com.example.android;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchClicked extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchclicked);
        mRecyclerView =  findViewById(R.id.daerahindonesia);

        ArrayList<ListsOfSearchClicked> exampleList = new ArrayList<>();
        exampleList.add(new ListsOfSearchClicked("Tanah Abang", "Station"));
        exampleList.add(new ListsOfSearchClicked("Cilebut", "Station"));
        exampleList.add(new ListsOfSearchClicked("Bojonggede", "Station"));
        exampleList.add(new ListsOfSearchClicked("Citayam", "Station"));
        exampleList.add(new ListsOfSearchClicked("Depok", "Station"));
        exampleList.add(new ListsOfSearchClicked("Depok Baru", "Station"));
        exampleList.add(new ListsOfSearchClicked("Pondok Cina", "Station"));
        exampleList.add(new ListsOfSearchClicked("Universitas Indonesia", "Station"));
        exampleList.add(new ListsOfSearchClicked("Universitas Pancasila", "Station"));
        exampleList.add(new ListsOfSearchClicked("Lenteng Agung", "Station"));
        exampleList.add(new ListsOfSearchClicked("Tanjung Barat", "Station"));
        exampleList.add(new ListsOfSearchClicked("Pasar Minggu", "Station"));
        exampleList.add(new ListsOfSearchClicked("Pasar Minggu Bulan", "Station"));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
