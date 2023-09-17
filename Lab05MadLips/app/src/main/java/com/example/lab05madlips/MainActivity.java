package com.example.lab05madlips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView madLipLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        madLipLogo = findViewById(R.id.madLipLogo);
        madLipLogo.setImageResource(R.drawable.madliblogo);

    }
}