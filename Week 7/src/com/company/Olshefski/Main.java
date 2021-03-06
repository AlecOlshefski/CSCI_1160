package com.company.Olshefski;

//enum is a locked list of sorts
enum Direction {NORTH, SOUTH, EAST, WEST}

class Storm{

    //Delcaring variables
    private double latitude;
    private double longitude;
    private double speed;
    //Refrencing enum (line 4)
    private Direction direction;

    //Keeps track of number of storms made
    static int numStorm;

    //Contructor
    public Storm(double latitude, double longitude, double speed, Direction direction) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.direction = direction;

        //Adds count to num storms
        numStorm ++;
    }

    //Blank constructor for if nothing is added (prevents errors)
    public Storm() {
        numStorm ++;
    }

    //Getters and setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    // To String
    public void display(){
        System.out.println("The storm is currently located at (" + latitude + "," +longitude+ ") moving at a speed of " +speed+ " MPH " +direction);
    }

    /*-------------------------------------------------------------------------------
    (Default) To String
    Even though this is correct another one is made for the purpose if the exercise
    @Override
    public String toString() {
        return "Storm{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", speed=" + speed +
                ", direction=" + direction +
                '}';
    }
    -------------------------------------------------------------------------------*/

}

//Extends take uses all attrributes from storm plus the extras in Sharknado
class Sharknado extends Storm{
    //Private keeps attributes in class
    private boolean isTornadoPresent;
    private int numShark;

    //Constructor
    public Sharknado(double latitude, double longitude, double speed, Direction direction, boolean isTornadoPresent, int numShark) {
        super(latitude, longitude, speed, direction);
        this.isTornadoPresent = isTornadoPresent;
        this.numShark = numShark;
    }

    //Getter and setter
    public boolean isTornadoPresent() {
        return isTornadoPresent;
    }

    public void setTornadoPresent(boolean tornadoPresent) {
        isTornadoPresent = tornadoPresent;
    }

    public int getNumShark() {
        return numShark;
    }

    public void setNumShark(int numShark) {
        this.numShark = numShark;
    }

    //To String
    //OVERIDE
    @Override
    public void display(){
        super.display();
        System.out.println("Number of sharks :" +numShark+ " Tornado: " +isTornadoPresent);
    }
}



public class Main {

    public static void main(String[] args) {
	//Creating a storm notice options from ENUM is a Title.PartOfList
        Storm storm1 = new Storm(39.97,-82.98,33,Direction.EAST);
        storm1.display();
    //Creating another storm from storm class and adding info in main
        Storm storm2 = new Storm();
        storm2.display();
        storm2.setDirection(Direction.NORTH);
        storm2.setSpeed(33);
        storm2.display();
    //Making a sharknano from sharknado class
        Sharknado storm3 = new Sharknado(40.7,-120.8,135,Direction.NORTH,true,5000);
        storm3.display();

        //Prints count of all storms
        System.out.println(Storm.numStorm);
    }
}
