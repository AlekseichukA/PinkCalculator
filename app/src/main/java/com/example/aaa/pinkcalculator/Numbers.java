package com.example.aaa.pinkcalculator;

public class Numbers {

    public static boolean canAddNumberToFirsNumberField(MainActivity mainActivity) {
        return  mainActivity.getFieldForFirsNumber().getText().length() >= 0 &&
                mainActivity.getFieldForOperation().getText().length() == 0 &&
                mainActivity.getFieldForSecondNumber().getText().length() == 0 &&
                mainActivity.getFieldForEqually().getText().length() == 0 &&
                mainActivity.getFieldForResult().getText().length() == 0;
    }

    public static boolean canAddNumberToSecondNumberField(MainActivity mainActivity) {
        return  mainActivity.getFieldForFirsNumber().getText().length() > 0 &&
                mainActivity.getFieldForOperation().getText().length() > 0 &&
                mainActivity.getFieldForSecondNumber().getText().length() >= 0 &&
                mainActivity.getFieldForEqually().getText().length() == 0 &&
                mainActivity.getFieldForResult().getText().length() == 0;
    }

    public static boolean canAddNullToFirsNumberField(MainActivity mainActivity) {
        if (mainActivity.getFieldForFirsNumber().getText().toString().equals("0") ||
                mainActivity.getFieldForFirsNumber().getText().equals("-0")) {
            return false;
        }
        return canAddNumberToFirsNumberField(mainActivity);
    }

    public static boolean canAddNullToSecondNumberField(MainActivity mainActivity) {
        if (mainActivity.getFieldForSecondNumber().getText().toString().equals("0") ||
                mainActivity.getFieldForSecondNumber().getText().equals("-0")) {
            return false;
        }
        return canAddNumberToSecondNumberField(mainActivity);
    }

    public static boolean canAddPointToFirsNumberField(MainActivity mainActivity) {
        if (mainActivity.getFieldForFirsNumber().getText().toString().contains(".")) return false;
        return canAddNumberToFirsNumberField(mainActivity);
    }

    public static boolean canAddPointToSecondNumberField(MainActivity mainActivity) {
        if (mainActivity.getFieldForSecondNumber().getText().toString().contains(".")) return false;
        return canAddNumberToSecondNumberField(mainActivity);
    }

    public static boolean canAddMinusToFirsNumberField(MainActivity mainActivity) {
        return  (mainActivity.getFieldForFirsNumber().getText().length() == 0 ||
                mainActivity.getFieldForFirsNumber().getText().toString().equals("-")) &&
                mainActivity.getFieldForOperation().getText().length() == 0 &&
                mainActivity.getFieldForSecondNumber().getText().length() == 0 &&
                mainActivity.getFieldForEqually().getText().length() == 0 &&
                mainActivity.getFieldForResult().getText().length() == 0;
    }

    public static boolean canAddMinusToSecondNumberField(MainActivity mainActivity) {
        return  mainActivity.getFieldForFirsNumber().getText().length() > 0 &&
                mainActivity.getFieldForOperation().getText().length() > 0 &&
                (mainActivity.getFieldForSecondNumber().getText().length() == 0 ||
                        mainActivity.getFieldForSecondNumber().getText().toString().equals("-")) &&
                mainActivity.getFieldForEqually().getText().length() == 0 &&
                mainActivity.getFieldForResult().getText().length() == 0;
    }

}
