package com.company.Olshefski;
//Main goal of generics is to prevent runtime errors


public class Main {

    public static void main(String[] args) {

        System.out.println(genericDisplayMethod("fish"));
        //genericDisplayMethod("abc");
        //genericDisplayMethod(123);
        //genericDisplayMethod(true);

    }

    //the T after "<T>" is to return a value
    public static <T> T genericDisplayMethod(T a){
        System.out.println(a);
        return a;
    }
}
