package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class DropdownStation extends AppCompatActivity {
    RecyclerView daerah_kereta;


    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.dropdown_stasiun);
        daerah_kereta = (RecyclerView)findViewById(R.id.jam_kereta);
        adapter = ArrayAdapter.createFromResource(this,R.array.daerah_daerah,android.R.layout.simple_expandable_list_item_1);

        daerah_kereta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), SelectionStation.class));
            }
        }
        );
    }
}

