package com.company.Olshefski;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            try {
                System.out.println("Please enter a string value:");
                String userString = input.nextLine();

                System.out.println("Your string value is " + userString);
                //After user receives conformation message, again = false to exit function
                again = false;

                /*
                -------------------------------------------------------------------------------
                I was having trouble with getting a string to work while doing a parse int and
                a parse double but the more i did the more I got confused, i commented it out so
                the code would run... Can we go over this in class?
                -------------------------------------------------------------------------------
                int testInt = Integer.parseInt(userString);
                double testDouble = Double.parseDouble(userString);

                if(testInt == testDouble) {
                    System.out.println("Im sorry but that is the incorrect data type 2");
                    input.next();
                }else(testInt!=testDouble);{
                    System.out.println("Your string value is " + userString);
                    //After user receives conformation message, again = false to exit function
                    again = false;
                }
                --------------------------------------------------------------------------------
                */

            }
            //If input is incorrect data type, catch will run
            catch (InputMismatchException e) {
                System.out.println("Im sorry but that is the incorrect data type");
                //input.next used to prevent an infinite loop(needed to return to try section)
                input.next();
            }
            //Any other errors will result in catch
            catch (Exception e) {
                System.out.println("Im sorry but that is the incorrect data type");
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
