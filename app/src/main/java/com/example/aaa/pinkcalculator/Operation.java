package com.example.aaa.pinkcalculator;

public class Operation {
    public static boolean isOperationFinished(MainActivity mainActivity) {
        return mainActivity.getFirstNumberView().getText().length() > 0
                && mainActivity.getOperationView().getText().length() > 0
                && mainActivity.getSecondNumberView().getText().length() > 0
                && mainActivity.getEquallyView().getText().length() > 0
                && mainActivity.getResultNumber().getText().length() > 0;
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
        return mainActivity.getFirstNumberView().getText().length() > 0
                && mainActivity.getOperationView().getText().length() > 0
                && mainActivity.getSecondNumberView().getText().length() > 0
                && mainActivity.getEquallyView().getText().length() == 0
                && mainActivity.getResultNumber().getText().length() == 0;
    }

    private static boolean canAddOperation(MainActivity mainActivity) {
        return mainActivity.getFirstNumberView().getText().length() > 0
                && mainActivity.getOperationView().getText().length() == 0
                && mainActivity.getSecondNumberView().getText().length() == 0
                && mainActivity.getEquallyView().getText().length() == 0
                && mainActivity.getResultNumber().getText().length() == 0;
    }

}
