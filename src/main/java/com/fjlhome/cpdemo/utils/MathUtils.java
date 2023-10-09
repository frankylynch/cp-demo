package com.fjlhome.cpdemo.utils;

//generate code for math functions

public class MathUtils {

    public double [] inputArray = {1.0, 2.0, 3.0, 4.0, 5.0};
    public double [] outputArray = {1.0, 2.0, 3.0, 4.0, 5.0};

    public double [] getInputArray() {
        return inputArray;
    }

    //generate a method that returns and output array which is the input array multiplies by another value
    public double [] getOutputArray(double multiplier) {
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] * multiplier;
        }
        return outputArray;
    }

    // generate a method that multiplies the inputArray by a multiplier and returns the outputArray
    public double [] multiplyArray(double multiplier) {
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] * multiplier;
        }
        return outputArray;
    }


    public double sum(double a, double b) {
        return a + b;
    }

    public double difference(double a, double b) {
        return a - b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}
