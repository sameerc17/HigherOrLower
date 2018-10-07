package com.example.sameer17.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int randno;
    public void guess(View view)
    {
        EditText guessEditText =(EditText) findViewById(R.id.guessEditText);
        int guessno=Integer.parseInt(guessEditText.getText().toString());
        if(guessno>randno)
        {
            Toast.makeText(MainActivity.this,"Your guess is higher! Try again!",Toast.LENGTH_SHORT).show();
        }
        else
        if(guessno<randno)
        {
            Toast.makeText(MainActivity.this,"Your guess is lower! Try again",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Your guess is correct! Congratulations! Let's try another number now.",Toast.LENGTH_LONG).show();
            Random rand=new Random();
            randno=rand.nextInt(50)+1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        randno=rand.nextInt(50)+1;

    }
}
