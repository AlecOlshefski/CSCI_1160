package com.company.Olshefski;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello World");
        int age = 18;
        double gpa =3.5;
        boolean isRaining = false;

        System.out.println(age+"|"+gpa+"|"+isRaining);

        String city = "Columbus";
        System.out.println(city.toUpperCase());

        float pi =3.14f;

        int dailyHighs[]={50,60,70,80,90};
        System.out.println(dailyHighs[0]);
        System.out.println(dailyHighs[1]);
        System.out.println(dailyHighs[2]);
        System.out.println(dailyHighs[3]);
        System.out.println(dailyHighs[4]);

        for(int i=0;i<=4;i++){
            System.out.println(dailyHighs[i]);
        }

        int twoDArray[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(twoDArray[0][0]);

        int sum=3+2;
        System.out.println(sum);

        double a = 10;
        double b =4;

        double quotient = a/b;
        System.out.println(quotient);

        double total=10.0/4.0;
        System.out.println(total);

        System.out.println("What is you name?");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println(name.toUpperCase());

    }
}
