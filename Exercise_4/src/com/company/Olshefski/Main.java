package com.company.Olshefski;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        String userInput;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter list of city name");

        while ((userInput = input.nextLine())!= "END"){
            cityList.add(userInput);
            System.out.println(userInput +" was added to the list! To add another city the name of the city in or type END to end");
            System.out.println(cityList);

    }
}
}
