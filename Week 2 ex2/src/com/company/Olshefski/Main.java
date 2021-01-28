package com.company.Olshefski;

public class Main {

    public static void main(String[] args) {
        int i = 0;

        System.out.println("While Loop");
        while (i < 10) {
            i += 2;
            System.out.println(i);
        }

        System.out.println("For loop");
        for (i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Do While loop");
        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i < 12);
        System.out.println("-------------------------------");

        int[] intergers = {1, 2, 3, 4, -1, -2, 10,4,-35};

        for (i = 0; i < intergers.length; i++) {
            if (intergers[i] < 0)
                System.out.println(intergers[i]);

        }
        System.out.println("----------------------------");
        for(int j = 1; j<=10; j+=2) {
            System.out.println(j);
        }

        System.out.println("-------------------------");

        String name="Simeon";
        System.out.println(name);
        name = name.substring(1, name.length()-1);
        System.out.println(name);
    }
}