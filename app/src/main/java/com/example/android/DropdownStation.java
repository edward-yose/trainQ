package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;


public class DropdownStation extends AppCompatActivity {
    ListView daerah_kereta;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.dropdown_stasiun);
        daerah_kereta = (ListView)findViewById(R.id.jam_kereta);
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

