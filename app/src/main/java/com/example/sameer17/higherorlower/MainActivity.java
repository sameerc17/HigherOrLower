package com.example.sameer17.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Button b;
    int randno,guessno,count=0;
    public void guess(View view)
    {
        EditText guessEditText =(EditText) findViewById(R.id.guessEditText);
        try{
            guessno=Integer.parseInt(guessEditText.getText().toString());
        }catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Please enter a valid value!!",Toast.LENGTH_LONG).show();
            guessEditText.setText("");
        }
            if (guessno > 0 && guessno<51) {
                if (guessno > randno)
                {
                    Toast.makeText(MainActivity.this, "Your guess is higher !! Try again!", Toast.LENGTH_SHORT).show();
                    guessEditText.setText("");
                    count++;
                }
                if (guessno < randno)
                {
                    Toast.makeText(MainActivity.this, "Your guess is lower !! Try again!", Toast.LENGTH_SHORT).show();
                    guessEditText.setText("");
                    count++;
                }
                if (guessno == randno)
                {
                    count++;
                    Toast.makeText(MainActivity.this, "Your guess is correct! Congratulations! You took "+count+" attempts.\nLet's try another number now.", Toast.LENGTH_LONG).show();
                    guessEditText.setText("");
                    Random rand = new Random();
                    randno = rand.nextInt(50) + 1;
                    count=0;
                }
            }
            else
            {
                Toast.makeText(MainActivity.this,"Please enter a valid value!!",Toast.LENGTH_LONG).show();
                guessEditText.setText("");
            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);
        Random rand=new Random();
        randno=rand.nextInt(50)+1;
        count=0;
    }
}
