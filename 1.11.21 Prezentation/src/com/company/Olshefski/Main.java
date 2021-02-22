package com.company.Olshefski;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> cities = new TreeSet<>();
        cities.add("Dayton");
        cities.add("Tokyo");
        cities.add("Columbus");
        cities.add("Cleveland");
        cities.add("Columbus");


        //cities.remove("Tokyo");
        //cities.clear();


        for (String city: cities) {
            System.out.println(city);
        }

    }
}