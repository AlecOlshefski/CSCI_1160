package com.company.Olshefski;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Array List created named task list
        ArrayList<String> taskList = new ArrayList<>();

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
                    addTask(taskList);
                    System.out.println("Task successfully added!");
                    displayMenu();
                    break;

                case "2":
                    removeTask(taskList);
                    System.out.println("Task successfully removed!");
                    displayMenu();
                    break;

                case "3":
                    updateTask(taskList);
                    System.out.println("Task successfully updated!");
                    displayMenu();
                    break;
                    
                case "4":
                    System.out.println("Your Tasks recorded are...");
                    displayAllTasks(taskList);
                    displayMenu();
                    break;

                case "0":
                    exitProgram();
                default:
                    System.out.println("Please insert one of the number from the menu (0-4)");

        }



    }

}
    //Displays menu after input
    private static void displayMenu(){
        System.out.println("Please choose an option: \n" +
                "(1) Add a task. \n" +
                "(2) Remove a task. \n" +
                "(3) Update a task. \n" +
                "(4) List all tasks. \n" +
                "(0) Exit. \n");
    }

    //For input 1 (Adds a task)
    static ArrayList<String> addTask(ArrayList <String> taskList){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a description of task");
        String userInput = input.nextLine();
        taskList.add(userInput);
        return taskList;
    }
    //For input 2 (removes a task)
    static ArrayList<String> removeTask(ArrayList<String>taskList){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the index of the task you want to remove");
        int userInput = input.nextInt();
        taskList.remove(userInput);
        return taskList;

    }

    //For input 3 (Updates a task)
    static ArrayList<String> updateTask(ArrayList<String> taskList){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an index value of task to update");
        int userInput = input.nextInt();
        System.out.println("What would you like to change the task to?");
        String desc = input.next();
        taskList.set(userInput,desc);
        return taskList;

    }

    //for input 4 (Displays all tasks)
    static void displayAllTasks(ArrayList<String> taskList){
        System.out.println(taskList);
    }

    //for input 0 (Closes program)
    static void exitProgram(){
        System.exit(0);
    }

}

