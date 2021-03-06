package com.company.Olshefski;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Calling functions and passing in respected variables
        stringEX();
        intEX();
        doubleEX();
    }

    //-----Functions-----

    //Function 1: String example
    static void stringEX(){
        Scanner input = new Scanner(System.in);

        //Variable used to repeat question if user input is not correct value
        boolean again = true;

        while(again) {
            //Runs try function if errors are absent
            String userString =" ";
            try {
                System.out.println("Please enter a string value:");
                userString = input.nextLine();

                //checks to see if data type is a double (works with string)
                Double.parseDouble(userString);

                //Lets user know that the datatype is incorrect (should be double)
                System.out.println("Im sorry but that is the incorrect data type");

                //again = true makes the while loop repeat
                again=true;
            }
            //Any other errors will result in catch.
            catch (Exception e) {

                //Gives user a confirmation message
                System.out.println("Your string value is " +userString);

                //Making again = false will break the loop
                again=false;
            }
        }
    }

    //Function 2: Int example
    static void intEX(){
        Scanner input = new Scanner(System.in);

        //Variable used to repeat question if user input is not correct value
        boolean again = true;

        //While loop automatically set to again = true
        while(again) {
            //Runs try function if errors are absent
            try {
                System.out.println("Please enter a int value");
                Integer userInt = input.nextInt();
                System.out.println("Your int value is " + userInt);

                //After user receives conformation message, again = false to exit function
                again = false;
            }
            //If input is incorrect data type, catch will run
            catch (InputMismatchException e) {
                System.out.println("Im sorry but that is the incorrect data type");

                //input.next used to prevent an infinite loop(needed to return to try section)
                input.next();
            }
            //Any other errors will result in catch
            catch (Exception e) {
                System.out.println("Something went wrong...");
            }
        }
    }

    //Function 3: Double example
    static void doubleEX () {
        Scanner input = new Scanner(System.in);

        //Variable used to repeat question if user input is not correct value
        boolean again = true;

        while (again) {
            //Runs try function if errors are absent
            try {
                System.out.println("Please enter a double value");
                Double userDouble = input.nextDouble();
                System.out.println("Your double value is " + userDouble);

                //After user receives conformation message, again = false to exit function
                again = false;
            }
            //If input is incorrect data type, catch will run
            catch (InputMismatchException e) {
                System.out.println("Im sorry but that is the incorrect data type");

                //input.next used to prevent an infinite loop(needed to return to try section)
                input.next();
            }
            //Any other errors will result in catch
            catch (Exception e) {
                System.out.println("Something went wrong...");
            }

        }
    }
}
