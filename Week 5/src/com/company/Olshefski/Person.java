package com.company.Olshefski;

public class Person {
    private String name;
    private int age;

    //Right click or (cmd + N) and select each option

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //to string method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void read(Book a){
        System.out.println(this.getName() + " is reading the book titled " +a.getTitle()+ " by " +a.getAuthor());
    }
}
