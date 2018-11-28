package com.example.menno_000.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        // Acts when floatingActionButton is clicked, go to next activity
        FloatingActionButton button = findViewById(R.id.main_newentrybutton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                addToDatabase();
            }
        });
    }

    private void addToDatabase() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
