package com.featurelogs.list.arraylist;

import java.util.*;
import java.util.stream.Collectors;

public class SortingUsers {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ravi", 1));
        users.add(new User("John", 2));
        users.add(new User("Gaurav", 3));
        users.add(new User("Max", 4));
        users.add(new User("Maddy", 5));

        Collections.shuffle(users);
        // print after shuffle
        users.forEach(System.out::print);
        System.out.println();

        //Sorting
        // 1. using comparable. Integer class implements comparable so, sorting works!!
        System.out.println(" \n Sort By id using comparable ");

        Collections.sort(users);
        users.forEach(System.out::print);

        Collections.shuffle(users);

        // 2. using comparator. Define a comparator to compare based on Id.
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                if (u1.id > u2.id)
                    return 1;
                else if (u1.id < u2.id)
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println(" \n Sort By id ");
        users.forEach(System.out::print);

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.name.compareTo(u2.name);
            }
        });

        System.out.println(" \n Sort By name ");
        users.forEach(System.out::print);
    }

}