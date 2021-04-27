package com.company.Olshefski;

import java.util.concurrent.Semaphore;

class Task implements Runnable{

    Semaphore sem = new Semaphore(2);

    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println("Run by " + Thread.currentThread().getName());

            for (int i = 0; i < 5; i++) {
                System.out.println("Running Thread: " + Thread.currentThread().getName());

                Thread.sleep(1000);
            }
            sem.release();
        } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



public class Main {

    public static void main(String[] args) {
        Task a = new Task();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);
        Thread t4 = new Thread(a);
        Thread t5 = new Thread(a);
        Thread t6 = new Thread(a);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        t5.setName("Thread 5");
        t6.setName("Thread 6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
