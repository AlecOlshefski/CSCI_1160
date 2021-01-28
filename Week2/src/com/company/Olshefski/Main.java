package com.company.Olshefski;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int lowTemp = 32;

        System.out.println(true | (lowTemp += 5) > 0);

        System.out.println(true || (lowTemp += 5) > 0);

        System.out.println(lowTemp);

        int currentTemp = 3;
        int warmThreshold = 60;

        if (currentTemp >= warmThreshold)
            System.out.println("Its warm outside");
        else
            System.out.println("cold out");


        String winddirection = "West";

        switch (winddirection) {
            case "North":
                System.out.println("Wind blow from north");
                break;
            case "South":
                System.out.println("Blow from south");
                break;
            case "West":
                System.out.println("Blow from west");
                break;
            case "East":
                System.out.println("Blow from east");
                break;
            default:
                System.out.println("I dont know where its blowing");
        }

        int i = 0;

        for(; i<=10;){
            System.out.println(i + "*" + i + "=" + i * i);
            i++;
        }

        int j=0;

        String[] words = {"hello","how","are","you"};
        for(j=0; j< words.length; j++){
            System.out.println(words[j]);
        }
        System.out.println(j);
        System.out.println(words.length);
    }
}
