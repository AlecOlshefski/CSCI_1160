package com.company.Olshefski;

class Hello implements Runnable{
    public void run(){

        for(int i = 0; i<5 ; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class World implements Runnable{
    public void run(){
        for(int i = 0; i<5 ; i++) {
            System.out.println("World");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Hello object1 = new Hello();
        World object2= new World();

        Thread t1 = new Thread(object1);
        Thread t2 = new Thread(object2);

        t1.start();
        t2.start();

    }
}
