package com.example.lab1task11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val numToGuess = Random.nextInt(1000);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numToGuess = Random.nextInt(1000)

    }
    fun validate (view: View){
        var inputField: EditText = findViewById(R.id.editTextNumber);
        var message: TextView = findViewById(R.id.lblMessage) ;
        val number = Integer.parseInt(inputField.text.toString());
        if(number > numToGuess){
            message.text = "Your guess is to high";
        } else if(number < numToGuess ){
            message.text = "Your guess is to low";
        } else {
            message.text = "Hoorah!! You guessed it correct";
        }
    }

}