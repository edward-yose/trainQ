package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ConditionStatus extends AppCompatActivity {
    RecyclerView capacity;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate (Bundle SavedInstanceStates){
        super.onCreate(SavedInstanceStates);
        setContentView(R.layout.condition_stasiun);
        capacity = (RecyclerView)findViewById(R.id.kapasitas);
        adapter = ArrayAdapter.createFromResource(this, R.array.gerbong_kereta, android.R.layout.simple_expandable_list_item_1);

        capacity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ReportGerbang.class));
            }
        });
    }
}
