package com.company.Olshefski;

import java.util.concurrent.ConcurrentLinkedQueue;

class Electronic{
    public void start(){
        System.out.println("Electronic device powered on!");
    }
}

class Camera extends Electronic{
    public void takePic(){
        System.out.println("Photo taken.");
    }

    @Override
    public void start() {
        System.out.println("Camera powered on!");
    }
}


public class Main {

    public static void main(String[] args) {

        Electronic electronic1 = new Electronic();
        Camera camera1 = new Camera();

        electronic1.start();
        camera1.takePic();
        camera1.start();

        System.out.println("--------------------------------------");

        //Left shows avalible methods, right shows the a actual object
        Electronic electronic2 = new Camera();
        electronic2.start();
        ((Camera)electronic2).takePic();

        System.out.println("--------------------------------------");

        Electronic electronic3 = new Electronic();
        electronic3.start();

    }
}
