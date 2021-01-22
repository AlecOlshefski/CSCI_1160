package com.company.Olshefski;

public class Main {

    public static void main(String[] args) {
        String city = "Columbus";
        int zip = 43215;
        double temp[]={32.0,25.0,27.0,40.0,45.0};
        double tempsum = 0;

        for(int i=0; i<5; i++) {
            tempsum = tempsum + temp[i];
        }
        double avr = tempsum/5;

        System.out.println("City: " +city+ " Zip Code: " +zip+ " Average High Temperature " +avr);
        }
    }

