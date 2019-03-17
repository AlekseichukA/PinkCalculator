package com.example.aaa.pinkcalculator;

public class Operation {
    public static boolean isOperationFinished(MainActivity mainActivity) {
        return lengthOfFirstNumberView(mainActivity) > 0
                && lengthOfOperationView(mainActivity) > 0
                && lengthOfSecondNumberView(mainActivity) > 0
                && lengthOfEquallyView(mainActivity) > 0
                && lengthOfResultNumber(mainActivity) > 0;
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
        return lengthOfFirstNumberView(mainActivity) > 0
                && lengthOfOperationView(mainActivity) > 0
                && lengthOfSecondNumberView(mainActivity) > 0
                && lengthOfEquallyView(mainActivity) == 0
                && lengthOfResultNumber(mainActivity) == 0;
    }

    private static boolean canAddOperation(MainActivity mainActivity) {
        return lengthOfFirstNumberView(mainActivity) > 0
                && lengthOfOperationView(mainActivity) == 0
                && lengthOfSecondNumberView(mainActivity) == 0
                && lengthOfEquallyView(mainActivity) == 0
                && lengthOfResultNumber(mainActivity) == 0;
    }

    private static int lengthOfFirstNumberView(MainActivity mainActivity) {
        return mainActivity.getFirstNumberView().getText().length();
    }

    private static int lengthOfOperationView(MainActivity mainActivity) {
        return mainActivity.getOperationView().getText().length();
    }

    private static int lengthOfSecondNumberView(MainActivity mainActivity) {
        return mainActivity.getSecondNumberView().getText().length();
    }

    private static int lengthOfEquallyView(MainActivity mainActivity) {
        return mainActivity.getEquallyView().getText().length();
    }

    private static int lengthOfResultNumber(MainActivity mainActivity) {
        return mainActivity.getResultNumber().getText().length();
    }

}
