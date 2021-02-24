package com.company.Olshefski;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter age");
            int age = input.nextInt();
            validate(age);
        }
        catch (InputMismatchException e){
            System.out.println("Im sorry but that is the incorrect data type");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }

    static void validate(int a){
        if (a >= 18){
            System.out.println("You are old enough to vote!");
        } else{
            System.out.println("Im sorry but you are not old enough to vote");
        }
    }

}
