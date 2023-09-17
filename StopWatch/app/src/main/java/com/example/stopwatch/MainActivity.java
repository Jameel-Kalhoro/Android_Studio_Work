package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = findViewById(R.id.timer);
    }

    // start button logic
    public void onStart(View view){
        Handler handler = new Handler();


    }

    // stop button logic
    public void onStop(View view){

    }

    // reset button logic
    public void onReset(View view){

    }

}