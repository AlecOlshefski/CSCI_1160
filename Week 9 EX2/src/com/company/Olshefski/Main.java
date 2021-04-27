package com.company.Olshefski;

abstract class Wrestler{

    public void paymentForWork(int hours){
        System.out.println("The wrestler will make $" + (hours*250.00));
    }

    public abstract void entranceMusic();
    public abstract void finisher();
    public abstract void combo1();
    public abstract void combo2();
}

class JohnCena extends Wrestler{

    @Override
    public void paymentForWork(int hours) {
        super.paymentForWork(hours);
    }

    @Override
    public void entranceMusic() {
        System.out.println("Song A");
    }

    @Override
    public void finisher() {
        System.out.println("Some finisher");
    }

    @Override
    public void combo1() {
        System.out.println("A B A B");
    }

    @Override
    public void combo2() {
        System.out.println("X Y X Y");
    }
}

public class Main {

    public static void main(String[] args) {
	Wrestler wrestler1 = new JohnCena();
	wrestler1.entranceMusic();
	wrestler1.finisher();
	wrestler1.combo1();
	wrestler1.combo2();
	wrestler1.paymentForWork(200000);

    }
}
