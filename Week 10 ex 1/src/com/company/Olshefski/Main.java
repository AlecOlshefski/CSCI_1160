package com.company.Olshefski;

interface Flier{
    void takeoff();
    void fly();
    void land();
}

class Airplane implements Flier{

    private int speed;
    String registration;

    public Airplane(int speed, String registration){
        this.speed=speed;
        this.registration = registration;
    }

    @Override
    public void takeoff(){
        System.out.println("Airplane taking off!");
    }

    @Override
    public void fly(){
        System.out.println("Airplane Flying!");
    }

    @Override
    public void land(){
        System.out.println("Landing gear down and landing!");
    }
}

class Bee implements Flier{

    int age;

    public Bee(int age){
        this.age=age;
    }

    @Override
    public void takeoff(){
        System.out.println("Bee starting to fly");
    }

    @Override
    public void fly(){
        System.out.println("bee Flying!");
    }

    @Override
    public void land(){
        System.out.println("Bee landing");
    }

}


public class Main {
    public static void main(String[] args) {
        Airplane plane = new Airplane(900,"A3X");
        Bee bee1 = new Bee(1);
        bee1.takeoff();
    }
}
