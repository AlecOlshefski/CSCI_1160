package com.company.Olshefski;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();

        //adding to the first array
        firstList.add("A");
        firstList.add("B");
        firstList.add("C");

        //adding to the second array
        secondList.add("D");
        secondList.add("E");
        secondList.add("F");

        //add elements from SecondList to firstList
        firstList.addAll(secondList);
        System.out.println(firstList);


        }

    }

/* Even though this was marked correct, these options would have worked as well

        ------------------------Option 1--------------------------------
        static List<String> combine(List<String> firstList, List<String> secondList) {
            List<String> newList = new ArrayList<>();
            newList.addAll(firstList);
            newList.addAll(secondList);
            return newList;

         ------------------------Option 2--------------------------------
                     static List<String> combine(List<String> firstList, List<String> secondList) {
                List<String> newList = new ArrayList<>();
                for (String element: firstList) {
                    newList.add(element);
                }
                for (String element: secondList) {
                    newList.add(element);
                }
                return newList;
            }
         */

