package com.example.aaa.pinkcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String NULL = "0";
    private static final String ONE = "1";
    private static final String TWO = "2";
    private static final String THREE = "3";
    private static final String FOUR = "4";
    private static final String FIVE = "5";
    private static final String SIX = "6";
    private static final String SEVEN = "7";
    private static final String EIGHT = "8";
    private static final String NINE = "9";
    private static final String POINT = ".";
    private static final String NULL_AND_POINT = "0.";
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String EQUALLY = "=";
    private static final String EMPTY_TEXT = "";
    private static final String MESSAGE_ERROR = "Ошибка!";
    private static final String MESSAGE_DIVISION_ON_NULL = "Ошибка, деление на 0!";


    private TextView firstNumberView;
    private TextView operationView;
    private TextView secondNumberView;
    private TextView equallyView;
    private TextView resultView;
    private Double firstNumber;
    private Double secondNumber;
    private Double resultNumber;

    public TextView getFirstNumberView() {
        return firstNumberView;
    }

    public TextView getOperationView() {
        return operationView;
    }

    public TextView getSecondNumberView() {
        return secondNumberView;
    }

    public TextView getResultNumber() {
        return resultView;
    }

    public TextView getEquallyView() {
        return equallyView;
    }

    private void allClean() {
        firstNumberView.setText(null);
        operationView.setText(null);
        secondNumberView.setText(null);
        equallyView.setText(null);
        resultView.setText(null);
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
            case R.id.null_button:
                nextOperation();
                if (Numbers.canAddNullToFirstNumberView(this)) {
                    firstNumberView.append(NULL);
                } else if (Numbers.canAddNullToSecondNumberView(this)) {
                    secondNumberView.append(NULL);
                }

                break;
            case R.id.one_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(ONE);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(ONE);
                }

                break;
            case R.id.two_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(TWO);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(TWO);
                }

                break;
            case R.id.three_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(THREE);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(THREE);
                }

                break;
            case R.id.four_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(FOUR);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(FOUR);
                }

                break;
            case R.id.five_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(FIVE);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(FIVE);
                }

                break;
            case R.id.six_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(SIX);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(SIX);
                }

                break;
            case R.id.seven_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(SEVEN);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(SEVEN);
                }

                break;
            case R.id.eight_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(EIGHT);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(EIGHT);
                }

                break;
            case R.id.nine_button:
                nextOperation();
                if (Numbers.canAddNumberToFirstNumberView(this)) {
                    firstNumberView.append(NINE);
                } else if (Numbers.canAddNumberToSecondNumberView(this)) {
                    secondNumberView.append(NINE);
                }

                break;
            case R.id.point_button:
                nextOperation();
                if (Numbers.canAddPointToFirstNumberView(this)) {
                    if (firstNumberView.getText().length() == 0 ||
                            firstNumberView.getText().toString().equals(MINUS)) {
                        firstNumberView.append(NULL_AND_POINT);
                    } else firstNumberView.append(POINT);
                } else if (Numbers.canAddPointToSecondNumberView(this)) {
                    if (secondNumberView.getText().length() == 0 ||
                            secondNumberView.getText().toString().equals(MINUS)) {
                        secondNumberView.append(NULL_AND_POINT);
                    } else secondNumberView.append(POINT);
                }

                break;
            case R.id.plus_button:
                if (Operation.canAddPlus(this)) {
                    operationView.append(PLUS);
                }

                break;
            case R.id.minus_button:
                if (Numbers.canAddMinusToFirstNumberView(this)) {
                    if (firstNumberView.getText().toString().contains(MINUS)) {
                        firstNumberView.setText(EMPTY_TEXT);
                    } else {
                        firstNumberView.append(MINUS);
                    }
                } else if (Operation.canAddMinus(this)) {
                    operationView.append(MINUS);
                } else if (Numbers.canAddMinusToSecondNumberView(this)) {
                    if (secondNumberView.getText().toString().contains(MINUS)) {
                        secondNumberView.setText(EMPTY_TEXT);
                    } else {
                        secondNumberView.append(MINUS);
                    }
                }

                break;
            case R.id.multiplication_button:
                if (Operation.canAddMultiplication(this)) {
                    operationView.append(MULTIPLICATION);
                }

                break;
            case R.id.division_button:
                if (Operation.canAddDivision(this)) {
                    operationView.append(DIVISION);
                }

                break;
            case R.id.equally_button:
                if (Operation.canAddEqually(this)) {
                    equallyView.append(EQUALLY);
                    try {
                        firstNumber = Double.parseDouble(firstNumberView.getText().toString());
                        secondNumber = Double.parseDouble(secondNumberView.getText().toString());
                        switch (operationView.getText().toString()) {
                            case PLUS:
                                resultNumber = firstNumber + secondNumber;
                                resultView.append(resultNumber.toString());

                                break;
                            case MINUS:
                                resultNumber = firstNumber - secondNumber;
                                resultView.append(resultNumber.toString());

                                break;
                            case MULTIPLICATION:
                                resultNumber = firstNumber * secondNumber;
                                resultView.append(resultNumber.toString());

                                break;
                            case DIVISION:
                                if (secondNumber == 0.0) {
                                    resultView.append(MESSAGE_DIVISION_ON_NULL);
                                } else {
                                    resultNumber = firstNumber / secondNumber;
                                    resultView.append(resultNumber.toString());
                                }

                                break;
                        }
                    } catch (NumberFormatException ex) {
                        resultView.append(MESSAGE_ERROR);
                    }
                }

                break;
            case R.id.all_clean_button:
                allClean();

                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumberView = findViewById(R.id.first_number_text_view);
        operationView = findViewById(R.id.mathematical_operation_text_view);
        secondNumberView = findViewById(R.id.second_number_text_view);
        equallyView = findViewById(R.id.equally_text_view);
        resultView = findViewById(R.id.result_text_view);
        Button nullButton = findViewById(R.id.null_button);
        Button oneButton = findViewById(R.id.one_button);
        Button twoButton = findViewById(R.id.two_button);
        Button threeButton = findViewById(R.id.three_button);
        Button fourButton = findViewById(R.id.four_button);
        Button fiveButton = findViewById(R.id.five_button);
        Button sixButton = findViewById(R.id.six_button);
        Button sevenButton = findViewById(R.id.seven_button);
        Button eightButton = findViewById(R.id.eight_button);
        Button nineButton = findViewById(R.id.nine_button);
        Button pointButton = findViewById(R.id.point_button);
        Button equallyButton = findViewById(R.id.equally_button);
        Button plusButton = findViewById(R.id.plus_button);
        Button minusButton = findViewById(R.id.minus_button);
        Button multiplicationButton = findViewById(R.id.multiplication_button);
        Button divisionButton = findViewById(R.id.division_button);
        Button allCleanButton = findViewById(R.id.all_clean_button);
        nullButton.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        pointButton.setOnClickListener(this);
        equallyButton.setOnClickListener(this);
        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        multiplicationButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);
        allCleanButton.setOnClickListener(this);
    }
}
