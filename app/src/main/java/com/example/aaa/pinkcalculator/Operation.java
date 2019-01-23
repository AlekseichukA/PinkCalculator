package com.example.aaa.pinkcalculator;

public class Operation {
    private static boolean canAddOperation(MainActivity mainActivity) {
        return  mainActivity.getFieldForFirsNumber().getText().length() > 0 &&
                mainActivity.getFieldForOperation().getText().length() == 0 &&
                mainActivity.getFieldForSecondNumber().getText().length() == 0 &&
                mainActivity.getFieldForEqually().getText().length() == 0 &&
                mainActivity.getFieldForResult().getText().length() == 0;
    }

    public static boolean isOperationFinished(MainActivity mainActivity) {
        return  mainActivity.getFieldForFirsNumber().getText().length() > 0 &&
                mainActivity.getFieldForOperation().getText().length() > 0 &&
                mainActivity.getFieldForSecondNumber().getText().length() > 0 &&
                mainActivity.getFieldForEqually().getText().length() > 0 &&
                mainActivity.getFieldForResult().getText().length() > 0;
    }

    public static boolean canAddPlus(MainActivity mainActivity) {
        return canAddOperation(mainActivity);
    }

    public static boolean canAddMultiplication(MainActivity mainActivity) {
        return canAddOperation(mainActivity);
    }

    public static boolean canAddDivision(MainActivity mainActivity) {
        return canAddOperation(mainActivity);
    }

    public static boolean canAddMinus(MainActivity mainActivity) {
        return canAddOperation(mainActivity);
    }

    public static boolean canAddEqually(MainActivity mainActivity) {
        return  mainActivity.getFieldForFirsNumber().getText().length() > 0 &&
                mainActivity.getFieldForOperation().getText().length() > 0 &&
                mainActivity.getFieldForSecondNumber().getText().length() > 0 &&
                mainActivity.getFieldForEqually().getText().length() == 0 &&
                mainActivity.getFieldForResult().getText().length() == 0;
    }

}
