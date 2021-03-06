package com.company.killoran;

class Person {
    String name;
    int health = 100;


    public Person(String name, int health) {
        this.name = name;
        this.health = health;

        if (health>50)
            System.out.println("Hi my name is "+ getName() + " thanks for creating me!\n\t I feel @ full health...health: "+ getHealth()+"\n");
        else
            System.out.println("Hi my name is "+ getName() + " and I don't feel very well...health: "+ getHealth()+"\n");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void blast(Person a){

        if (a.getClass() == SuperHero.class) {
            System.out.println("Your punch is not as effective against a superhero!");
            a.setHealth(a.getHealth()-5);
        }
        else
            a.setHealth(a.getHealth()-10);

        System.out.println(getName() + " blasted: " + a.getName()+ ". Their current health is: "+ a.getHealth());
    }

}