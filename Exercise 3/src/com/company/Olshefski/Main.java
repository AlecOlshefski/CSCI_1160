package com.company.Olshefski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tempf = 0;
        while (tempf >= -460){
            tempf = userinput();
            double tempc= conversion(tempf);
            displayTemp(tempf,tempc);

        }
    }

    public static double userinput(){
        System.out.println("Please enter a temperature in Fahrenheit");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static double conversion(double tempf){
        return 5 * (tempf - 32)/9;
    }

    public static void displayTemp(double tempf,double tempc){
        System.out.println(tempf + "° in Fahrenheit converts to");
        System.out.printf("%.3f", tempc);
        System.out.println("° Celsius");
    }

}
