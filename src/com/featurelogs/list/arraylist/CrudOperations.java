package com.featurelogs.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class CrudOperations {

    public static void main(String[] args) {

        //Add Operation
        //1. Add method
        List<String> counting = new ArrayList<>();
        counting.add("One");
        counting.add("two");

        //2. Add all from another list
        List<String> langs = new ArrayList<>();
        langs.add("java");
        langs.add("C");

        counting.addAll(langs);

        System.out.println(counting.size());    // output =>
        // Read Operation
        //1. Read using index
        System.out.println(counting.get(0));    // output =>

        //2. Read all with for loop
        for (int i = 0; i < counting.size(); i++) {
            System.out.println(counting.get(i));
        }

        // 3. Read with iterator
        Iterator<String> itr = counting.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //4. Read using forEach lopp
        for (String str :
                counting) {
            System.out.println(str);
        }

        //5. Java 8 streams and consumer
        counting.stream().forEach(System.out::println);  // output =>
        //or
        counting.forEach(System.out::println);  // output =>

        // Update Operations
        //1. Update value on index
        counting.set(0,"Not One");

        //2. replace after running update on all elements
        counting.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if(s.equalsIgnoreCase("java")){
                   return  (s+"-update").toLowerCase();
                }
                return s;
            }
        });
        counting.forEach(System.out::println); // output =>

        // Delete Operation
        //1. Remove by index
        counting.remove(0);
        counting.forEach(System.out::println); // output =>

        // 2. remove all data
        counting.clear();
        counting.forEach(System.out::println);
    }
}
