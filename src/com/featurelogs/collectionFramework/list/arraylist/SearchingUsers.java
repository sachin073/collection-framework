package com.featurelogs.collectionFramework.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchingUsers {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ravi",1));
        users.add(new User("John",2));
        users.add(new User("Gaurav",3));
        users.add(new User("Max",4));
        users.add(new User("Maddy",5));

        // randomize collection
        Collections.shuffle(users);
        // print after shuffle
        users.forEach(System.out::print);
        System.out.println();

        // searching without using in-build functions i.e. basic loop
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(new User("Ravi",1)) ) {
                System.out.println("found on index : " + i);
                break;
            }
        }

        //find index of value 3 using in-built function indexOf
        System.out.println("found on index : "+users.indexOf(new User("Ravi",1)));

        //java 8 searching/filtering

        users.add(new User("Ravi",1)); //adding 3 again to create duplicates

        //1. check if 3 exist in list
        System.out.println(users.stream().filter(user -> user.equals(new User("Ravi",1))).findFirst().get() != null);
        //output true

        // 2. check number of integer with value 3 exist in list
        System.out.println(users.stream().filter(user -> user.equals(new User("Ravi",1))).collect(Collectors.toList()).size());
        //output 2

    }
}
