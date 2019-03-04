package com.example.aaa.pinkcalculator;

public class Numbers {
    private static final String NULL = "0";
    private static final String POINT = ".";
    private static final String MINUS = "-";
    private static final String MINUS_AND_NULL = "-0";

    public static boolean canAddNumberToFirstNumberView(MainActivity mainActivity) {
        return  mainActivity.getFirstNumberView().getText().length() >= 0 &&
                mainActivity.getOperationView().getText().length() == 0 &&
                mainActivity.getSecondNumberView().getText().length() == 0 &&
                mainActivity.getEquallyView().getText().length() == 0 &&
                mainActivity.getResultNumber().getText().length() == 0;
    }

    public static boolean canAddNumberToSecondNumberView(MainActivity mainActivity) {
        return  mainActivity.getFirstNumberView().getText().length() > 0 &&
                mainActivity.getOperationView().getText().length() > 0 &&
                mainActivity.getSecondNumberView().getText().length() >= 0 &&
                mainActivity.getEquallyView().getText().length() == 0 &&
                mainActivity.getResultNumber().getText().length() == 0;
    }

    public static boolean canAddNullToFirstNumberView(MainActivity mainActivity) {
        if (mainActivity.getFirstNumberView().getText().toString().equals(NULL) ||
                mainActivity.getFirstNumberView().getText().equals(MINUS_AND_NULL)) {
            return false;
        }
        return canAddNumberToFirstNumberView(mainActivity);
    }

    public static boolean canAddNullToSecondNumberView(MainActivity mainActivity) {
        if (mainActivity.getSecondNumberView().getText().toString().equals(NULL) ||
                mainActivity.getSecondNumberView().getText().equals(MINUS_AND_NULL)) {
            return false;
        }
        return canAddNumberToSecondNumberView(mainActivity);
    }

    public static boolean canAddPointToFirstNumberView(MainActivity mainActivity) {
        if (mainActivity.getFirstNumberView().getText().toString().contains(POINT)) return false;
        return canAddNumberToFirstNumberView(mainActivity);
    }

    public static boolean canAddPointToSecondNumberView(MainActivity mainActivity) {
        if (mainActivity.getSecondNumberView().getText().toString().contains(POINT)) return false;
        return canAddNumberToSecondNumberView(mainActivity);
    }

    public static boolean canAddMinusToFirstNumberView(MainActivity mainActivity) {
        return  (mainActivity.getFirstNumberView().getText().length() == 0 ||
                mainActivity.getFirstNumberView().getText().toString().equals(MINUS)) &&
                mainActivity.getOperationView().getText().length() == 0 &&
                mainActivity.getSecondNumberView().getText().length() == 0 &&
                mainActivity.getEquallyView().getText().length() == 0 &&
                mainActivity.getResultNumber().getText().length() == 0;
    }

    public static boolean canAddMinusToSecondNumberView(MainActivity mainActivity) {
        return  mainActivity.getFirstNumberView().getText().length() > 0 &&
                mainActivity.getOperationView().getText().length() > 0 &&
                (mainActivity.getSecondNumberView().getText().length() == 0 ||
                        mainActivity.getSecondNumberView().getText().toString().equals("-")) &&
                mainActivity.getEquallyView().getText().length() == 0 &&
                mainActivity.getResultNumber().getText().length() == 0;
    }

}
