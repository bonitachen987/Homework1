package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2;
    private TextView sum;
    private TextView sumValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDices = (Button) findViewById(R.id.rollDices);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        sum = (TextView) findViewById(R.id.textViewSum);
        sumValue = (TextView) findViewById(R.id.textValueSum);


        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = randomDiceValue();
                int value2= randomDiceValue();

                int res1 = getResources().getIdentifier("dice" + value1, "drawable", "com.example.homework1");
                int res2 = getResources().getIdentifier("dice" + value2, "drawable", "com.example.homework1");

                imageView1.setImageResource(res1);
                imageView2.setImageResource(res2);

                int value3 = value1 + value2;
                sumValue.setText(String.valueOf(value3));

            }
        });
    }


    public static int randomDiceValue(){
        return RANDOM.nextInt(6) + 1;
    }
}
