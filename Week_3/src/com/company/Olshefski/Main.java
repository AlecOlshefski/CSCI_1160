package com.company.Olshefski;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        helloWorld();
        helloName("Ren");
        helloName("Joe","Bob");
        addingNumbers();
        addingNumbers(39,50);
        System.out.println(addingNumbers(3.2, 4.5, 6.7));
        squaring(5);

        System.out.println(circle("Test", "Red", 2.5  ));
    }

    static void helloWorld(){
        System.out.println("Hello World");
    }

    static void helloName(String name){
        System.out.println("Hello " +name+ ", Welcome to Methods!");
    }

    static void helloName(String namea, String nameb){
        System.out.println("Hello " +namea + ", and " + nameb);
    }
    //-----------------------------------------
    static void addingNumbers(){
        int a =10;
        int b =20;
        System.out.println(a+b);
    }

    static void addingNumbers(int a, int b){
        System.out.println(a+b);
    }

    static double addingNumbers(double a, double b, double c){
        double d=a+b+c;

        return d;
    }

    static void squaring(int a){
        System.out.println(a*a);
    }
    //--------------------------------------
    static double circle(String name, String color, double radius){
        System.out.println(name);
        System.out.println(color);
        System.out.println(radius);

        return 2* Math.PI * radius;


    }
}
