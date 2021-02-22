/*
The following code was what was requested to be debugged
---------------------------------------------------------

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Integer> assignTemps() {
        Map<String, Integer> temperatures = new HashMap<>();

        for (int i = 0; i < cities.length; i++) {
            temperatures.put(cities[i], temps[i]);
        }
    }

    static void displayFreezing(Map<String, Integer> temps){
        for (String city: temps.keySet()) {
            if (temps.get(city) <= 32) {
                System.out.println("It's cold in " + city + "!");
            }
        }
    }

    public static void main(String[] args) {
        String[] cities = {"Cleveland", "New York", "Dallas", "Tampa"};
        int[] temps = {15, 30, 45, 70};
        tempMap = assignTemps(cities, temps);
        displayFreezing(tempMap);
    }
}
 */

package com.company.Olshefski;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, Integer> assignTemps(String[] cities, int[] temps) {
        Map<String, Integer> temperatures = new HashMap<>();

        for (int i = 0; i < cities.length; i++) {
            temperatures.put(cities[i], temps[i]);
        }
        return temperatures;
    }

    static void displayFreezing(Map<String, Integer> temps){
        for (String city: temps.keySet()) {
            if (temps.get(city) <= 32) {
                System.out.println("It's cold in " + city + "!");
            }
        }
    }

    public static void main(String[] args) {
        String[] cities = {"Cleveland", "New York", "Dallas", "Tampa"};
        int[] temps = {15, 30, 45, 70};
        Map<String, Integer> tempMap = assignTemps(cities, temps);
        displayFreezing(tempMap);
    }
}