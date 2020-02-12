package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class SearchClicked extends AppCompatActivity {
    RecyclerView Viewer;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Viewer = (RecyclerView)findViewById(R.id.daerahindonesia);
        adapter = ArrayAdapter.createFromResource(this,R.array.daerah_daerah,android.R.layout.simple_expandable_list_item_1);
//        Viewer.setAdapter(adapter);
        Viewer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), SelectionStation.class));
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.list, menu);
//        return true;
//    }
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
//    }
}
