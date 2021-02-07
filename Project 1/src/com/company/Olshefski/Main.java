package com.company.Olshefski;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option: \n" +
                "(1) Add a task. \n" +
                "(2) Remove a task. \n" +
                "(3) Update a task. \n" +
                "(4) List all tasks. \n" +
                "(0) Exit. \n");

        while (true){
            String menuInput = input.nextLine();

            switch (menuInput) {
                    case "1":
                    System.out.println("Task successfully added!");
                    System.out.println("Please choose an option: \n" +
                            "(1) Add a task. \n" +
                            "(2) Remove a task. \n" +
                            "(3) Update a task. \n" +
                            "(4) List all tasks. \n" +
                            "(0) Exit. \n");
                    break;
                case "2":
                    System.out.println("Task successfully removed!");
                    System.out.println("Please choose an option: \n" +
                            "(1) Add a task. \n" +
                            "(2) Remove a task. \n" +
                            "(3) Update a task. \n" +
                            "(4) List all tasks. \n" +
                            "(0) Exit. \n");
                    break;
                case "3":
                    System.out.println("Task successfully updated!");
                    System.out.println("Please choose an option: \n" +
                            "(1) Add a task. \n" +
                            "(2) Remove a task. \n" +
                            "(3) Update a task. \n" +
                            "(4) List all tasks. \n" +
                            "(0) Exit. \n");
                    break;
                case "4":
                    System.out.println("Your Tasks recorded are...");

                    System.out.println("Please choose an option: \n" +
                            "(1) Add a task. \n" +
                            "(2) Remove a task. \n" +
                            "(3) Update a task. \n" +
                            "(4) List all tasks. \n" +
                            "(0) Exit. \n");
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Please insert one of the number from the menu (0-4)");

        }



    }
}
}

