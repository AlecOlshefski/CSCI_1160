package com.company.Olshefski;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        //Array List created named task list
        ArrayList<Task> taskList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option: \n" +
                "(1) Add a task. \n" +
                "(2) Remove a task. \n" +
                "(3) Update a task. \n" +
                "(4) List all tasks. \n" +
                "(5) List tasks by priority\n" +
                "(0) Exit. \n");

        while (true){
            String menuInput = input.nextLine();

            switch (menuInput) {

                case "0":
                    Gson gson = new Gson();
                    ArrayList task1 = new ArrayList();
                    task1.add(taskList);
                    String json = gson.toJson(task1);

                    try {
                        FileWriter writer = new FileWriter("data.json");
                        gson.toJson(taskList, writer);
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    exitProgram();
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
                    Gson gson1 = new Gson();
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader("data.json"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    ArrayList<Task> task2 = gson1.fromJson(br, ArrayList.class);
                    System.out.println(task2);
                    priorityList(taskList);
                    displayMenu();
                    break;

                case "5":
                    listPriority(taskList);
                    displayMenu();
                    break;

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
                "(5) List tasks by priority \n" +
                "(0) Exit. \n");
    }

    //For input 1 (Adds a task)
    static ArrayList<Task> addTask(ArrayList <Task> taskList){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of a task");
        String taskName = input.nextLine();

        System.out.println("Please enter a description of task");
        String taskDesc = input.nextLine();

        System.out.println("Please enter a priortity (1-5)");
        int taskpri = input.nextInt();
        input.nextLine();

        //Adds all attributes given from the "Task" class and adds it to the array list
        taskList.add(new Task(taskName,taskDesc,taskpri));
        return taskList;
    }

    //For input 2 (removes a task)
    static ArrayList<Task> removeTask(ArrayList<Task>taskList){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the index of the task you want to remove");
        int userInput = input.nextInt();
        taskList.remove(userInput);
        return taskList;

    }

    //For input 3 (Updates a task)
    static ArrayList<Task> updateTask(ArrayList<Task>taskList){
        Scanner input = new Scanner(System.in);
        System.out.println("Your tasks are \n" + taskList);

        System.out.println("Please enter an index value of task to update");
        int userInput = input.nextInt();
        input.nextLine();

        System.out.println("What would you like to change the description of the task to?");
        String newdesc = input.next();

        //The userinput is put into a variable (ObjectA) to find the object in the array list
        Task objectA = taskList.get(userInput);

        //using ObjectA, the title and priority is found
        String taskName = objectA.getName();
        int taskpri = objectA.getPriority();

        //the attributes found from objectA are added aswell as the updated description
        taskList.add(new Task(taskName,newdesc,taskpri));

        //The original object is removed from the list
        taskList.remove(objectA);

        return taskList;

    }

    //for input 4 (Displays all tasks)
    static void priorityList(ArrayList<Task>taskList){
        Collections.sort(taskList);

        int i = 0;
        for(Task a : taskList){
            System.out.println(a);
        }
    }

    //For input 5 (Displaying tasks with a selected priority)
    static void listPriority(ArrayList<Task> wholeList) {
        Scanner input = new Scanner(System.in);

        boolean again = true;
        while (again) {
            try {
                //Asks user for a specific priority to look for
                System.out.println("Please enter a priority");
                int userpri = input.nextInt();
                //Removes bug in version of Java
                input.nextLine();

        /* Puts into a for-each ( ":" = each part) loop to find all tasks that match
        the priority of the user input (userpri) */
                for (Task individualTask : wholeList) {

            /* If the user input is able to find a task in the array with
            the correct priority it will print out the task */
                    if (userpri == individualTask.getPriority()) {
                        System.out.println(individualTask);
                        again = false;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("That is the incorrect data type, please try again");
                 input.next();
            } catch (Exception e){
                System.out.println("Something went wrong...");
                input.next();
            }
        }
    }

    //for input 0 (Closes program)
    static void exitProgram(){
        System.exit(0);
    }

}

