package com.company.Olshefski;

//Making an abstract class
abstract class Animal{
    //Declaring variables
    private String name;
    private int age;

    //Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Abstract method
    abstract  public void speak();
    //Abstact methods dont have bodies
    //Method is the bridge to other classes


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class dog extends Animal{
    private String breed;

    public dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("woof");

    }
}

class cat extends Animal{
    private String furColor;

    public cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }
}




public class Main {

    public static void main(String[] args) {

        dog odie = new dog("Odie",5,"Beagle");
        cat garfield = new cat("Garfield",6,"Orange");

        System.out.println(odie);
        System.out.println("---------------------");
        System.out.println(garfield);
    }
}
