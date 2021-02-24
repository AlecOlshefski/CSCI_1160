package com.company.Olshefski;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //UNDERSTANDING OF VARIABLES IN FUNCTIONS
    /* When variables in main are passed into the
    function, out of the main, "a" and "b" are placed
    in function and match with each index automatically
    EX number = a and number 2 = b
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Try is used to make sure the user does not expirence any errors during
        //progarm runtime
        try {
            //Ask user for first num
            System.out.println("Please enter the first number");
            int number = input.nextInt();

            //Ask user for second num
            Scanner InputNumberTwo = new Scanner(System.in);
            System.out.println("Please enter a second number");
            int number2 = input.nextInt();

            //Calls functions
            add(number, number2);
            divide(number,number2);

        }
        // If input is a different data type (From int) catch will run
        catch(InputMismatchException e){
            System.out.println("I am sorry but that is the incorrect data type");
        }

        //If program has a arithmetic error (divide by 0) catch will run
        catch(ArithmeticException e){
            System.out.println("Sorry I cannot divide by 0");
        }

        //If program causes any other error, catch will run
        catch (Exception e){
            System.out.println("Something went wrong");
        }


    }

    //----Functions----

    //Function 1 (adding variables)
    static void add(int a, int b){
        System.out.println(a+b);
    }

    //Function (dividing variables)
    static void divide(int a, int b){
        System.out.println(a/b);
    }

}
