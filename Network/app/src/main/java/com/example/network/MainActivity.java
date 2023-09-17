package com.example.network;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text2);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                readData("http://google.com");
            }
        });
        thread.start();
    }

    public void readData(String urlString){
        URL url= null;
        HttpURLConnection connection = null;
        try{
            url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            final InputStream inputStream = connection.getInputStream();
            text.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        text.setText(inputStream.read() + "");
                    } catch (Exception ex){

                    }
                }
            });
        } catch (Exception e){

        }
    }
}