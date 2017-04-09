package com.example.kms.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    float first_number, second_number;
    int operator = 0;
    int[] numberBntArray = {R.id.zero, R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons
        Button buttonZero = (Button) findViewById(R.id.zero);
        Button buttonOne = (Button) findViewById(R.id.one);
        Button buttonTwo = (Button) findViewById(R.id.two);
        Button buttonThree = (Button) findViewById(R.id.three);
        Button buttonFour = (Button) findViewById(R.id.four);
        Button buttonFive = (Button) findViewById(R.id.five);
        Button buttonSix = (Button) findViewById(R.id.six);
        Button buttonSeven = (Button) findViewById(R.id.seven);
        Button buttonEight = (Button) findViewById(R.id.eight);
        Button buttonNine = (Button) findViewById(R.id.nine);

        // Operators
        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button divide = (Button) findViewById(R.id.divide);
        Button multiply = (Button) findViewById(R.id.multiply);

        // Result
        Button equal = (Button) findViewById(R.id.equal);

        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);

        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        float resultNumber = 0;
        String textviewString;
        final TextView resultText = (TextView) findViewById(R.id.result);

        switch( v.getId() ) {

            case R.id.zero :
                resultText.setText(resultText.getText().toString() + "0");
                break;

            case R.id.one :
                resultText.setText(resultText.getText().toString() + "1");
                break;

            case R.id.two :
                resultText.setText(resultText.getText().toString() + "2");
                break;

            case R.id.three :
                resultText.setText(resultText.getText().toString() + "3");
                break;

            case R.id.four :
                resultText.setText(resultText.getText().toString() + "4");
                break;

            case R.id.five :
                resultText.setText(resultText.getText().toString() + "5");
                break;

            case R.id.six :
                resultText.setText(resultText.getText().toString() + "6");
                break;

            case R.id.seven :
                resultText.setText(resultText.getText().toString() + "7");
                break;

            case R.id.eight :
                resultText.setText(resultText.getText().toString() + "8");
                break;

            case R.id.nine :
                resultText.setText(resultText.getText().toString() + "9");
                break;


            case R.id.plus :
                textviewString = resultText.getText().toString();
                first_number = Float.parseFloat(textviewString);
                resultText.setText("");

                operator = 1;
                break;

            case R.id.minus :
                textviewString = resultText.getText().toString();
                first_number = Float.parseFloat(textviewString);
                resultText.setText("");

                operator = 2;
                break;

            case R.id.divide :
                textviewString = resultText.getText().toString();
                first_number = Float.parseFloat(textviewString);
                resultText.setText("");

                operator = 3;
                break;

            case R.id.multiply :
                textviewString = resultText.getText().toString();
                first_number = Float.parseFloat(textviewString);
                resultText.setText("");

                operator = 4;
                break;

            case R.id.equal :
                textviewString = resultText.getText().toString();
                second_number = Float.parseFloat(textviewString);

                switch (operator) {

                    case 1 :
                        resultNumber = first_number + second_number;
                        break;

                    case 2 :
                        resultNumber = first_number - second_number;
                        break;

                    case 3 :
                        resultNumber = first_number / second_number;
                        break;

                    case 4 :
                        resultNumber = first_number * second_number;
                        break;
                }

                textviewString = String.valueOf(resultNumber);
                resultText.setText(textviewString);
        }
    }
}
