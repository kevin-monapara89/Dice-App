package com.kevin.diceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgdice1, imgdice2;
    TextView txtnum1, txtnum2, txttotalnum;
    CardView btnroll;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgdice1 = findViewById(R.id.imgdice1);
        imgdice2 = findViewById(R.id.imgdice2);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        txttotalnum = findViewById(R.id.txttotalnum);
        btnroll = findViewById(R.id.btnroll);

        btnroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num1 = random.nextInt(6)+1;
                int num2 = random.nextInt(6)+1;

                if (num1 == 1) {
                    imgdice1.setImageResource(R.drawable.img);
                    txtnum1.setText("Dice Number : 1 ");
                }
                if (num1 == 2) {
                    imgdice1.setImageResource(R.drawable.img_1);
                    txtnum1.setText("Dice Number : 2 ");
                }
                if (num1 == 3) {
                    imgdice1.setImageResource(R.drawable.img_2);
                    txtnum1.setText("Dice Number : 3 ");
                }
                if (num1 == 4) {
                    imgdice1.setImageResource(R.drawable.img_3);
                    txtnum1.setText("Dice Number : 4 ");
                }
                if (num1 == 5) {
                    imgdice1.setImageResource(R.drawable.img_4);
                    txtnum1.setText("Dice Number : 5 ");
                }
                if (num1 == 6) {
                    imgdice1.setImageResource(R.drawable.img_5);
                    txtnum1.setText("Dice Number : 6 ");
                }

                if (num2 == 1) {
                    imgdice2.setImageResource(R.drawable.img);
                    txtnum2.setText("Dice Number : 1 ");
                }
                if (num2 == 2) {
                    imgdice2.setImageResource(R.drawable.img_1);
                    txtnum2.setText("Dice Number : 2 ");
                }
                if (num2 == 3) {
                    imgdice2.setImageResource(R.drawable.img_2);
                    txtnum2.setText("Dice Number : 3 ");
                }
                if (num2 == 4) {
                    imgdice2.setImageResource(R.drawable.img_3);
                    txtnum2.setText("Dice Number : 4 ");
                }
                if (num2 == 5) {
                    imgdice2.setImageResource(R.drawable.img_4);
                    txtnum2.setText("Dice Number : 5 ");
                }
                if (num2 == 6) {
                    imgdice2.setImageResource(R.drawable.img_5);
                    txtnum2.setText("Dice Number : 6 ");
                }
                txttotalnum.setText("Total Number : "+(num1+num2));
            }
        });
    }
}