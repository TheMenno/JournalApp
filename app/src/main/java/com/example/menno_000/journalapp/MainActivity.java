package com.example.menno_000.journalapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // A listener that goes to a new view after an entry is chosen
    private class OnItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            // Retrieve chosen Entry
            //Entry clickedEntry = (Entry) adapterView.getItemAtPosition(i);

            // Give info to new view
            //Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            //intent.putExtra("clickedEntry", clickedEntry);
            //startActivity(intent);
        }
    }

    // A listener that goes to a new view after an entry is chosen
    private class OnLongItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            // Retrieve chosen Entry
            //Entry clickedEntry = (Entry) adapterView.getItemAtPosition(i);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Acts when floatingActionButton is clicked, go to next activity
        FloatingActionButton button = findViewById(R.id.main_newbutton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                toInputActivity();
            }
        });

        // Set listeners on the listview
        ListView lv = findViewById(R.id.main_list);
        lv.setOnItemClickListener(new OnItemClickListener());
        lv.setOnItemClickListener(new OnLongItemClickListener());

        // Set adapter on the grid
        //GridView grid = findViewById(R.id.main_list);
        //grid.setAdapter(adapter);

        EntryDatabase db = EntryDatabase.getInstance(getApplicationContext());
    }

    // Go to the next activity
    private void toInputActivity() {
        Intent intent = new Intent(this, InputActivity.class);
        this.startActivity(intent);
    }
}
