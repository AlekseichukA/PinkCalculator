package com.example.aaa.pinkcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView fieldForFirsNumber;
    private TextView fieldForOperation;
    private TextView fieldForSecondNumber;
    private TextView fieldForEqually;
    private TextView fieldForResult;

    private Button buttonFor_0;
    private Button buttonFor_1;
    private Button buttonFor_2;
    private Button buttonFor_3;
    private Button buttonFor_4;
    private Button buttonFor_5;
    private Button buttonFor_6;
    private Button buttonFor_7;
    private Button buttonFor_8;
    private Button buttonFor_9;
    private Button buttonFor_point;
    private Button buttonFor_equally;
    private Button buttonFor_plus;
    private Button buttonFor_minus;
    private Button buttonFor_multiplication;
    private Button buttonFor_division;
    private Button buttonFor_all_clean;

    private Double firstNumber;
    private Double secondNumber;
    private Double resultNumber;

    public TextView getFieldForFirsNumber() {
        return fieldForFirsNumber;
    }

    public TextView getFieldForOperation() {
        return fieldForOperation;
    }

    public TextView getFieldForSecondNumber() {
        return fieldForSecondNumber;
    }

    public TextView getFieldForResult() {
        return fieldForResult;
    }

    public TextView getFieldForEqually() {
        return fieldForEqually;
    }

    private void allClean() {
        fieldForFirsNumber.setText(null);
        fieldForOperation.setText(null);
        fieldForSecondNumber.setText(null);
        fieldForEqually.setText(null);
        fieldForResult.setText(null);
        firstNumber = null;
        secondNumber = null;
        resultNumber = null;
    }

    private void nextOperation() {
        if (Operation.isOperationFinished(this)) {
            allClean();
        }
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b_clickingOn_0:
                nextOperation();
                if (Numbers.canAddNullToFirsNumberField(this)) {
                    fieldForFirsNumber.append("0");
                }
                else if (Numbers.canAddNullToSecondNumberField(this)) {
                    fieldForSecondNumber.append("0");
                }
                break;

            case R.id.b_clickingOn_1:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("1");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("1");
                }
                break;

            case R.id.b_clickingOn_2:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("2");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("2");
                }
                break;

            case R.id.b_clickingOn_3:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("3");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("3");
                }
                break;

            case R.id.b_clickingOn_4:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("4");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("4");
                }
                break;

            case R.id.b_clickingOn_5:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("5");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("5");
                }
                break;

            case R.id.b_clickingOn_6:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("6");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("6");
                }
                break;

            case R.id.b_clickingOn_7:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("7");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("7");
                }
                break;

            case R.id.b_clickingOn_8:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("8");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("8");
                }
                break;

            case R.id.b_clickingOn_9:
                nextOperation();
                if (Numbers.canAddNumberToFirsNumberField(this)) {
                    fieldForFirsNumber.append("9");
                }
                else if (Numbers.canAddNumberToSecondNumberField(this)) {
                    fieldForSecondNumber.append("9");
                }
                break;

            case R.id.b_clickingOn_point:
                nextOperation();
                if (Numbers.canAddPointToFirsNumberField(this)) {
                    if (fieldForFirsNumber.getText().length() == 0 ||
                            fieldForFirsNumber.getText().toString().equals("-")) {
                        fieldForFirsNumber.append("0.");
                    }
                    else fieldForFirsNumber.append(".");
                }
                else if (Numbers.canAddPointToSecondNumberField(this)) {
                    if (fieldForSecondNumber.getText().length() == 0 ||
                            fieldForSecondNumber.getText().toString().equals("-")) {
                        fieldForSecondNumber.append("0.");
                    }
                    else fieldForSecondNumber.append(".");
                }
                break;

            case R.id.b_clickingOn_plus:
                if (Operation.canAddPlus(this)) {
                    fieldForOperation.append("+");
                }
                break;

            case R.id.b_clickingOn_minus:
                if (Numbers.canAddMinusToFirsNumberField(this)) {
                    if (fieldForFirsNumber.getText().toString().contains("-")) {
                        fieldForFirsNumber.setText("");
                    }
                    else {
                        fieldForFirsNumber.append("-");
                    }
                }
                else if (Operation.canAddMinus(this)) {
                     fieldForOperation.append("-");
                }
                else if (Numbers.canAddMinusToSecondNumberField(this)) {
                    if (fieldForSecondNumber.getText().toString().contains("-")) {
                        fieldForSecondNumber.setText("");
                    }
                    else {
                        fieldForSecondNumber.append("-");
                    }
                }
                break;

            case R.id.b_clickingOn_multiplication:
                if (Operation.canAddMultiplication(this)) {
                    fieldForOperation.append("*");
                }
                break;

            case R.id.b_clickingOn_division:
                if (Operation.canAddDivision(this)) {
                    fieldForOperation.append("/");
                }
                break;

            case R.id.b_clickingOn_equally:
                if (Operation.canAddEqually(this)) {
                    fieldForEqually.append("=");
                    try {
                        firstNumber = Double.parseDouble(fieldForFirsNumber.getText().toString());
                        secondNumber = Double.parseDouble(fieldForSecondNumber.getText().toString());
                        switch (fieldForOperation.getText().toString()) {
                            case "+":
                                resultNumber = firstNumber + secondNumber;
                                fieldForResult.append(resultNumber.toString());
                                break;
                            case "-":
                                resultNumber = firstNumber - secondNumber;
                                fieldForResult.append(resultNumber.toString());
                                break;
                            case "*":
                                resultNumber = firstNumber * secondNumber;
                                fieldForResult.append(resultNumber.toString());
                                break;
                            case "/":
                                if (secondNumber == 0.0) {
                                    fieldForResult.append("Ошибка, деление на 0!");
                                } else {
                                    resultNumber = firstNumber / secondNumber;
                                    fieldForResult.append(resultNumber.toString());
                                }
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        fieldForResult.append("Ошибка!");
                    }
                }
                break;

            case R.id.b_clickingOn_all_clean:
                allClean();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fieldForFirsNumber = findViewById(R.id.tv_for_first_number);
        fieldForOperation = findViewById(R.id.tv_for_mathematical_operation);
        fieldForSecondNumber = findViewById(R.id.tv_for_second_number);
        fieldForEqually = findViewById(R.id.tv_for_equally);
        fieldForResult = findViewById(R.id.tv_for_result);

        buttonFor_0 = findViewById(R.id.b_clickingOn_0);
        buttonFor_1 = findViewById(R.id.b_clickingOn_1);
        buttonFor_2 = findViewById(R.id.b_clickingOn_2);
        buttonFor_3 = findViewById(R.id.b_clickingOn_3);
        buttonFor_4 = findViewById(R.id.b_clickingOn_4);
        buttonFor_5 = findViewById(R.id.b_clickingOn_5);
        buttonFor_6 = findViewById(R.id.b_clickingOn_6);
        buttonFor_7 = findViewById(R.id.b_clickingOn_7);
        buttonFor_8  = findViewById(R.id.b_clickingOn_8);
        buttonFor_9 = findViewById(R.id.b_clickingOn_9);
        buttonFor_point = findViewById(R.id.b_clickingOn_point);
        buttonFor_equally = findViewById(R.id.b_clickingOn_equally);
        buttonFor_plus = findViewById(R.id.b_clickingOn_plus);
        buttonFor_minus = findViewById(R.id.b_clickingOn_minus);
        buttonFor_multiplication = findViewById(R.id.b_clickingOn_multiplication);
        buttonFor_division = findViewById(R.id.b_clickingOn_division);
        buttonFor_all_clean = findViewById(R.id.b_clickingOn_all_clean);

        buttonFor_0.setOnClickListener(this);
        buttonFor_1.setOnClickListener(this);
        buttonFor_2.setOnClickListener(this);
        buttonFor_3.setOnClickListener(this);
        buttonFor_4.setOnClickListener(this);
        buttonFor_5.setOnClickListener(this);
        buttonFor_6.setOnClickListener(this);
        buttonFor_7.setOnClickListener(this);
        buttonFor_8.setOnClickListener(this);
        buttonFor_9.setOnClickListener(this);
        buttonFor_point.setOnClickListener(this);
        buttonFor_equally.setOnClickListener(this);
        buttonFor_plus.setOnClickListener(this);
        buttonFor_minus.setOnClickListener(this);
        buttonFor_multiplication.setOnClickListener(this);
        buttonFor_division.setOnClickListener(this);
        buttonFor_all_clean.setOnClickListener(this);
    }
}
