package com.example.lab2task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView msg;
    boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.Emotion);
        msg = findViewById(R.id.msg);
        img.setImageResource(R.drawable.before);
        flag = true;


    }

    public void onCLick(View view){
        if(flag) {
            img.setImageResource(R.drawable.after);
            msg.setText("I am Full");
            flag = false;
        } else {
            img.setImageResource(R.drawable.before);
            msg.setText("I am Humgry");
            flag = true;
        }

    }
}