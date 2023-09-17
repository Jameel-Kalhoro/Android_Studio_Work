package com.example.lab2task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView hangmanIcon;
    TextView guessword;
    TextView typeCharacter;
    TextView message;
    String [] wordDictionary;
    String word;
    String tempWord;
    Random random;
    int selectWord;
    int firstWord;
    int secondWord;
    int counter=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordDictionary = new String[]{"Game", "Assassin", "Hypnotise","Spank","Hangman"};
        random = new Random();
        hangmanIcon = findViewById(R.id.hangmanIcon);
        hangmanIcon.setImageResource(R.drawable.hangmanicon);
        guessword = findViewById(R.id.guessword);
        message = findViewById(R.id.message);
        typeCharacter = findViewById(R.id.typeCharacter);

        guessword.setText("??????");

    }

    public void newClick(View view){

        selectWord = random.nextInt(4);
        word = wordDictionary[selectWord];
        guessword.setText(word);
        firstWord = random.nextInt(word.length()-1);
        secondWord = random.nextInt(word.length()-1);

        while(firstWord == secondWord){
            secondWord = random.nextInt(word.length()-1);
        }

        tempWord ="";
        for (int i=0; i<word.length(); i++){
            if(i == firstWord){
                tempWord += word.charAt(firstWord);
            } else if(i == secondWord){
                tempWord += word.charAt(secondWord);
            } else{
                tempWord += "?";
            }
        }

        guessword.setText(tempWord);
    }


    public void guessClick(View view){
        boolean flag = false;
        if(counter > 1){
            String characterString = typeCharacter.getText().toString();
            char character = characterString.charAt(0);
            char[] array = tempWord.toCharArray();
            for (int i=0; i<word.length(); i++){
                if (Character.compare(character, word.charAt(i))==0){
                    flag = true;
                    array[i] = character;
                    break;
                }
            }

            String abc ="";
            for (int i=0; i<array.length; i++){
                abc += array[i];
            }

            tempWord = abc;
            guessword.setText(tempWord);
            if(!flag){
                counter --;
                message.setText("You Have Guessed: "+counter+" guesses left");
            }
            typeCharacter.setText("");
        } else{
            message.setText("Your game is over no guess is left!!");
        }
    }


}