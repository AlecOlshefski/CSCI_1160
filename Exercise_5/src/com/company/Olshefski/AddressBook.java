package com.company.Olshefski;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Creates a hashmap to store input
        HashMap<String, String> addressBook = new HashMap<>();

        //Declares a variable for the menu selection
        int userMenu = 0;

        //Menu where "3" will close the program
        while (userMenu != 3) {
            System.out.println("---Address-Book---\n" +
                    "1:Add contact \n" +
                    "2:Search for a contact\n" +
                    "3:Quit");
            userMenu = input.nextInt();

            switch(userMenu) {
                case 1:
                    //Opens the addContact function
                    addContact(addressBook);
                    break;
                case 2:
                    //Opens the searchContact function
                    searchContact(addressBook);
                    break;
                case 3:
                    //Closes the program
                    break;
                default:
                    //If user adds anything beside 1,2,3
                    System.out.println("Please enter a number provided from the menu");

            }
        }
    }

    //----------METHODS----------
    //---METHOD-1---
    static void addContact(HashMap<String, String> addressBook) {
        Scanner input= new Scanner(System.in);

        //Asks for name and email of contact
        System.out.println("Enter the name of the contact:");
        String userName = input.nextLine();
        System.out.println("Enter the contacts email:");
        String userEmail = input.next();

        //Takes stored inputs into the Hash Map
        addressBook.put(userName,userEmail);

        //Lets user know it was successful
        System.out.println("Contact was successfully added!");
    }

    //---METHOD-2---
    static void searchContact(HashMap<String,String> addressBook){
        Scanner input= new Scanner(System.in);

        //Asks user for name of contact to search
        System.out.println("Please enter the name of the contact you are searching for:");
        String nameSearch = input.nextLine();

        if(addressBook.containsKey(nameSearch)){
            //The .contains value will print out a boolean expression if statement is tru or not
            boolean boolA = addressBook.containsValue(nameSearch);

            //If "boolA" in this case is true the .get method will get the value of the "nameSearch" var.
            if(boolA = true){
                String emailSearch = (String)addressBook.get(nameSearch);
                System.out.println("The email for " +nameSearch+ " is " +emailSearch);
            }
            //There is no need for a else in this case due to the fact the first arg (addressBook.containsKey(nameSearch))
            // is true so everything would continue as normal

        } else {
            //If the input is not in the hash map, it will let the user know and take them back to the menu
            System.out.println("Im sorry, but the name that you have entered is not in the Address book");
        }
    }

}