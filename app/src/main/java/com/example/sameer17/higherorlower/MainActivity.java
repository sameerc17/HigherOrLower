package com.example.sameer17.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int randno,guessno;
    public void guess(View view)
    {
        EditText guessEditText =(EditText) findViewById(R.id.guessEditText);
        try{
            guessno=Integer.parseInt(guessEditText.getText().toString());
        }catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Please enter a valid value!!",Toast.LENGTH_LONG).show();
        }
            if (guessno > 0 && guessno<51) {
                if (guessno > randno)
                {
                    Toast.makeText(MainActivity.this, "Your guess is higher !! Try again!", Toast.LENGTH_SHORT).show();
                }
                if (guessno < randno)
                {
                    Toast.makeText(MainActivity.this, "Your guess is lower !! Try again!", Toast.LENGTH_SHORT).show();
                }
                if (guessno == randno)
                {
                    Toast.makeText(MainActivity.this, "Your guess is correct! Congratulations! Let's try another number now.", Toast.LENGTH_LONG).show();
                    Random rand = new Random();
                    randno = rand.nextInt(50) + 1;
                }
            }
            else
            {
                Toast.makeText(MainActivity.this,"Please enter a valid value!!",Toast.LENGTH_LONG).show();
            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        randno=rand.nextInt(50)+1;
    }
}
