package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView  list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list_items);
        String[] array  = {"jameel", "ali","farzand","ammar","jameel", "ali","farzand","ammar","jameel", "ali","farzand","ammar","jameel", "ali","farzand","ammar","jameel", "ali","farzand","ammar","jameel", "ali","farzand","ammar"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,array);
        list.setAdapter(arrayAdapter);


    }
}

