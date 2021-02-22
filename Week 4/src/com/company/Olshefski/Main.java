package com.company.Olshefski;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=7;
        arr[2]=35;
        System.out.println(Arrays.toString(arr));

        //array list example
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        System.out.println(arrL);
        arrL.add(4564);
        System.out.println(arrL);

        //remove a index
        arrL.remove(1);
        System.out.println(arrL);

        //Antoher Array list example
        List<String> cities = new ArrayList<>();
        cities.add("Columbus");
        cities.add("New York");
        cities.add("Tokyo");
        System.out.println(cities);

        //Print indexes on seperate lines
        for(String city:cities){
            System.out.println(city);
        }

        //Set example (Skips repeated duplicate)
        Set<String> cities2 = new TreeSet<>();
        cities2.add("Grove City");
        cities2.add("Columbus");
        cities2.add("Cleveland");
        cities2.add("Columbus");
        System.out.println(cities2);

        //Maps example
        Map<Integer, String> hasMap = new HashMap<>();
        hasMap.put(1,"What");
        hasMap.put(2,"If");
        hasMap.put(3,"!");
        System.out.println(hasMap);

        // .get looks for key (in this case 1)
        System.out.println(hasMap.get(1));

        for(Integer key: hasMap.keySet()){
            System.out.println(key);
        }

    }
}
