package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button search_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_click = (Button) findViewById(R.id.activity_main_search_clicked);

        search_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();

            }
        });
    }

    private void nextActivity() {
        Intent intent = new Intent(this, SplashScreen.class);
        startActivity(intent);
    }
}
// do not forget to change the intent into SearchClicked.class not SplashScreen.class
