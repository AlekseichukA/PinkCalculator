package com.example.aaa.pinkcalculator;

import android.widget.TextView;
import static com.example.aaa.pinkcalculator.CommonConstants.getMinus;
import static com.example.aaa.pinkcalculator.CommonConstants.getPoint;
import static com.example.aaa.pinkcalculator.CommonConstants.getZero;

public class Numbers {
    private static final String MINUS_AND_NULL = "-0";

    public static boolean canAddNumberToFirstNumberView(MainActivity mainActivity) {
        return mainActivity.getFirstNumberView().getText().length() >= 0
                && mainActivity.getOperationView().getText().length() == 0
                && mainActivity.getSecondNumberView().getText().length() == 0
                && mainActivity.getEquallyView().getText().length() == 0
                && mainActivity.getResultNumber().getText().length() == 0;
    }

    public static boolean canAddNumberToSecondNumberView(MainActivity mainActivity) {
        return mainActivity.getFirstNumberView().getText().length() > 0
                && mainActivity.getOperationView().getText().length() > 0
                && mainActivity.getSecondNumberView().getText().length() >= 0
                && mainActivity.getEquallyView().getText().length() == 0
                && mainActivity.getResultNumber().getText().length() == 0;
    }

    public static boolean canAddZeroToFirstNumberView(MainActivity mainActivity) {
        if (mainActivity.getFirstNumberView().getText().toString().equals(getZero())
                || mainActivity.getFirstNumberView().getText().equals(MINUS_AND_NULL)) {
            return false;
        }
        return canAddNumberToFirstNumberView(mainActivity);
    }

    public static boolean canAddZeroToSecondNumberView(MainActivity mainActivity) {
        if (mainActivity.getSecondNumberView().getText().toString().equals(getZero())
                || mainActivity.getSecondNumberView().getText().equals(MINUS_AND_NULL)) {
            return false;
        }
        return canAddNumberToSecondNumberView(mainActivity);
    }

    public static boolean canAddPointToFirstNumberView(MainActivity mainActivity) {
        if (mainActivity.getFirstNumberView().getText().toString().contains(getPoint()))
            return false;
        return canAddNumberToFirstNumberView(mainActivity);
    }

    public static boolean canAddPointToSecondNumberView(MainActivity mainActivity) {
        if (mainActivity.getSecondNumberView().getText().toString().contains(getPoint()))
            return false;
        return canAddNumberToSecondNumberView(mainActivity);
    }

    public static boolean canAddZeroAndPointToFirstNumberView(MainActivity mainActivity) {
         return canAddZeroAndPoint(mainActivity.getFirstNumberView());
    }

    public static boolean canAddZeroAndPointToSecondNumberView(MainActivity mainActivity) {
        return canAddZeroAndPoint(mainActivity.getSecondNumberView());
    }

    public static boolean canAddMinusToFirstNumberView(MainActivity mainActivity) {
        return (mainActivity.getFirstNumberView().getText().length() == 0
                || mainActivity.getFirstNumberView().getText().toString().equals(getMinus()))
                && mainActivity.getOperationView().getText().length() == 0
                && mainActivity.getSecondNumberView().getText().length() == 0
                && mainActivity.getEquallyView().getText().length() == 0
                && mainActivity.getResultNumber().getText().length() == 0;
    }

    public static boolean canAddMinusToSecondNumberView(MainActivity mainActivity) {
        return mainActivity.getFirstNumberView().getText().length() > 0
                && mainActivity.getOperationView().getText().length() > 0
                && (mainActivity.getSecondNumberView().getText().length() == 0
                || mainActivity.getSecondNumberView().getText().toString().equals("-"))
                && mainActivity.getEquallyView().getText().length() == 0
                && mainActivity.getResultNumber().getText().length() == 0;
    }

    private static boolean canAddZeroAndPoint(TextView numberView) {
        return numberView.getText().length() == 0
                || numberView.getText().toString().equals(getMinus());
    }



}
