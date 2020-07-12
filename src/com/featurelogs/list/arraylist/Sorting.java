package com.featurelogs.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> counting = new ArrayList<>();
        counting.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        Collections.shuffle(counting);
        // print after shuffle
        counting.forEach(System.out::print);
        System.out.println();

        //Sorting
        // 1. using comparable. Integer class implements comparable so, sorting works!!
        Collections.sort(counting);
        counting.forEach(System.out::print);
        System.out.println();

        Collections.shuffle(counting);

        // 2. using comparator. Define a comparator and pass its object as a argument.
        counting.sort((o1, o2) -> {
            if (o1 > o2)
                return 1;
            else if (o1 < o2)
                return -1;
            else
                return 0;
        });

        counting.forEach(System.out::print);
    }

}