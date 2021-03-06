package com.company.killoran;

class Main {
    public static void main(String[] args) {
        // write your code here

        Person player1 = new Person("Tim",100);
        Person player2 = new Person("Mr. K",35);
        SuperHero player3 = new SuperHero("Clark Kent",100,"Superman");
        System.out.println("~~~~~Let's battle!!!!!!~~~~~\n");

        player1.blast(player2);
        player2.blast(player1);
        player3.blast(player1);
        player1.blast(player3);

    }
}


