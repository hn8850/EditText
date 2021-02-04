package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int num1 = rand.nextInt(90) + 10;
    int num2 = rand.nextInt(90) + 10;
    int toast = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView A1 = (TextView) findViewById(R.id.A1);
        TextView A2 = (TextView) findViewById(R.id.A2);
        EditText A3 = findViewById(R.id.A3);
        ImageView A4 = findViewById(R.id.A4);
        Button A5 = findViewById(R.id.A5);
        TextView B1 = (TextView) findViewById(R.id.B1);
        TextView B2 = (TextView) findViewById(R.id.B2);
        EditText B3 = findViewById(R.id.B3);
        ImageView B4 = findViewById(R.id.B4);
        Button B5 = findViewById(R.id.B5);
        TextView C1 = (TextView) findViewById(R.id.C1);
        TextView C2 = (TextView) findViewById(R.id.C2);
        EditText C3 = findViewById(R.id.C3);
        ImageView C4 = findViewById(R.id.C4);
        Button C5 = findViewById(R.id.C5);
        Button reset = findViewById(R.id.reset);
        B1.setText(null);
        B2.setText(null);
        C1.setText(null);
        C2.setText(null);
        B3.setEnabled(false);
        C3.setEnabled(false);
        B5.setEnabled(false);
        C5.setEnabled(false);
        A1.setText("" + num1);
        A2.setText("" + num2);

        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Answer1 = A3.getText().toString();
                int AnswerNum1 = Integer.parseInt(Answer1);
                if (num1+num2==AnswerNum1){
                    A4.setImageResource(R.drawable.ve);
                    toast=+1;
                }
                else{
                    A4.setImageResource(R.drawable.ve);
                }
                num1 = num1+num2;
                B1.setText("" + num1);
                num2 = rand.nextInt(90) + 10;
                B2.setText("" + num2);
                A5.setEnabled(false);
                A3.setEnabled(false);
                B5.setEnabled(true);
                B3.setEnabled(true);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Answer2 = B3.getText().toString();
                int AnswerNum2 = Integer.parseInt(Answer2);
                if (num1+num2==AnswerNum2){
                    B4.setImageResource(R.drawable.ve);
                    toast=+1;
                }
                else{
                    B4.setImageResource(R.drawable.bad);
                }
                num1 = num1+num2;
                C1.setText("" + num1);
                num2 = rand.nextInt(90) + 10;
                C2.setText("" + num2);
                B5.setEnabled(false);
                B3.setEnabled(false);
                C5.setEnabled(true);
                C3.setEnabled(true);
            }
        });
        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Answer3 = C3.getText().toString();
                int AnswerNum3 = Integer.parseInt(Answer3);
                if (num1+num2==AnswerNum3){
                    C4.setImageResource(R.drawable.ve);
                    toast=+1;
                }
                else{
                    C4.setImageResource(R.drawable.bad);
                }
                Toast.makeText(getApplicationContext(), "GG! You got" + toast + "/3 right!" , Toast.LENGTH_LONG).show();
                C5.setEnabled(false);
                C3.setEnabled(false);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = rand.nextInt(90) + 10;
                num2 = rand.nextInt(90) + 10;
                toast = 0;
                A1.setText("" + num1);
                A2.setText("" + num2);
                A5.setEnabled(true);
                B1.setText(null);
                B2.setText(null);
                C1.setText(null);
                C2.setText(null);
                A4.setImageResource(0);
                B4.setImageResource(0);
                C4.setImageResource(0);
                A3.setText(null);
                A3.setEnabled(true);
                B3.setText(null);
                C3.setText(null);




            }
        });
        }


}




