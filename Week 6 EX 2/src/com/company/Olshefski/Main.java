package com.company.Olshefski;

//Code copied from (https://github.com/zarthur/CSCC-Fundamentals-Android-Notes/tree/master/week_06) plus minor tweaks

class Arithmetic {
    public static double average(double values []) throws Exception {
        if (values.length == 0) {
            throw new Exception("Cannot divide by zero.");
        }
        double average = 0;
        for (double value: values) {
            average += value;
        }
        return average / values.length;
    }
}

public class Main {
    public static void main(String[] args) {
        double[] someValues = {};
        double averageValue = 0;
        try {
            averageValue = Arithmetic.average(someValues);
        }
        catch (Exception e) {
            System.out.println("Encountered an exception: " + e);
        }
        System.out.println(averageValue);
    }
}

