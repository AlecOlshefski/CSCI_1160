package com.company.Olshefski;

class Building {
    private String address;

    public Building(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Address:" + address);
    }



}

class House extends Building{
    private int resInHouse;

    public House(String address, int resInHouse) {
        super(address);
        this.resInHouse = resInHouse;
    }

    public int getResInHouse() {
        return resInHouse;
    }

    public void setResInHouse(int resInHouse) {
        this.resInHouse = resInHouse;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Residents: " + resInHouse);
    }
}

public class Main {
    public static void main(String[] args) {
        Building building = new Building("123 Main St.");
        building.displayInfo();

        House house = new House("456 High St.",4);
        house.displayInfo();
    }
}