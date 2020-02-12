package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectionStation extends AppCompatActivity {
    ListView jam_keberangkatan;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle SavedInstanceStates){
        super.onCreate(SavedInstanceStates);
        setContentView(R.layout.selection_station);
        jam_keberangkatan = (ListView)findViewById(R.id.jam_kereta);
        adapter = ArrayAdapter.createFromResource(this,R.array.jam_jam, android.R.layout.simple_expandable_list_item_2);

        jam_keberangkatan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), ConditionStatus.class));
            }
        });
    }
}
