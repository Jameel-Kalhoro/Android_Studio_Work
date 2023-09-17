package com.example.lab2task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    int coffeePrice = 4;
    float creamPrice = 0.0f ;
    int chocolatePrice = 0;
    float totalPrice;
    TextView quantity;
    String cream = "add whiped cream? ";
    String chocolate = "add chocolate? ";
    String qunatity= "Quantity: ";
    String price = "Price :";
    TextView summary;
    CheckBox creamCheck, chocolateCHeck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logo);
        logo.setImageResource(R.drawable.coffee);
        quantity = findViewById(R.id.quantity);
        summary = findViewById(R.id.summary);
        creamCheck = findViewById(R.id.cream);
        chocolateCHeck = findViewById(R.id.chocolate);
        summary.setText( cream+"\n"+chocolate+"\n"+qunatity+"\n\n"+price+"\n"+"Thank You!!");
    }

    public void addOnClick(View view){
        int inc = Integer.parseInt( quantity.getText().toString())+1;
        quantity.setText(inc+"");
        if(creamCheck.isChecked()){
            cream = "add whiped cream? Yes";
            creamPrice += 0.5f;
        } else {
            cream="add whiped cream? No";
            //creamPrice -= 0.5f;
        }

        if(chocolateCHeck.isChecked()){
            chocolate = "add chocolate? Yes";
            chocolatePrice += 1;
        } else {
            chocolate = "add chocolate? No";
            //chocolatePrice -= 1;
        }


        totalPrice = (coffeePrice*Float.parseFloat(quantity.getText().toString()))+creamPrice+chocolatePrice;
        summary.setText(cream+"\n"+chocolate+"\n"+qunatity+quantity.getText().toString()+"\n\n"+price+totalPrice+"\n"+"Thank You!!");

    }

    public void decOnClick(View view){
        int dec = Integer.parseInt( quantity.getText().toString())-1;
        quantity.setText(dec+"");
        if(creamCheck.isChecked()){
            cream = "add whiped cream? Yes";
            creamPrice += 0.5f;
        } else {
            cream="add whiped cream? No";
            //creamPrice -= 0.5f;
        }

        if(chocolateCHeck.isChecked()){
            chocolate = "add chocolate? Yes";
            chocolatePrice += 1;
        } else {
            chocolate = "add chocolate? No";
            //chocolatePrice -= 1;
        }


        totalPrice = (coffeePrice*Float.parseFloat(quantity.getText().toString()))+creamPrice+chocolatePrice;
        summary.setText(cream+"\n"+chocolate+"\n"+qunatity+quantity.getText().toString()+"\n\n"+price+totalPrice+"\n"+"Thank You!!");

    }

}