package com.featurelogs.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Searching {

    public static void main(String[] args) {
        List<Integer> counting = new ArrayList<>();
        counting.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        // randomize collection
        Collections.shuffle(counting);
        // print after shuffle
        counting.forEach(System.out::print);
        System.out.println();

        // searching without using in-build functions i.e. basic loop
        for (int i = 0; i < counting.size(); i++) {
            if (counting.get(i) == 3) {
                System.out.println("found on index : " + i);
                break;
            }
        }

        //find index of value 3 using in-built function indexOf
        System.out.println("found on index : "+counting.indexOf(3));

        //java 8 searching/filtering

        counting.add(3); //adding 3 again to create duplicates

        //1. check if 3 exist in list
        System.out.println(counting.stream().filter(integer -> integer == 3).findFirst().get() != null);
        //output true

        // 2. check number of integer with value 3 exist in list
        System.out.println(counting.stream().filter(integer -> integer == 3).collect(Collectors.toList()).size());
        //output 2

    }
}
