package com.featurelogs.collectionFramework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class CrudOperations {

    public static void main(String[] args) {

        //Add Operation
        //1. Add method
        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("John");

        //2. Add all from another list
        List<String> langs = new ArrayList<>();
        langs.add("java");
        langs.add("C");

        names.addAll(langs);

        System.out.println("Total elements " + names.size());
        // Read Operation
        //1. Read using index
        System.out.println("Read first element using index : " + names.get(0));

        //2. Read all with for loop
        System.out.println("Read all elements");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        // 3. Read with iterator
        System.out.println("\nRead all elements with iterator");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        //4. Read using forEach lopp
        System.out.println("\nRead all elements with plain forEach loop");
        for (String str :
                names) {
            System.out.print(str + " ");
        }

        //5. Java 8 streams and consumer
        System.out.println("\nRead all elements with Java 8 stream");
        names.stream().forEach((i) -> System.out.print(i + " "));  // output =>
        //or
        System.out.println("\nRead all elements with Java 8 foreach");
        names.forEach(i -> System.out.print(i + " "));

        // Update Operations
        //1. Update value on index
        names.set(0, "Jane");
        System.out.println("\nValue at index zero after update " + names.get(0));

        //2. replace after running update on all elements
        names.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.equalsIgnoreCase("java")) {
                    return (s + "-update").toLowerCase();
                }
                return s;
            }
        });
        System.out.println("\nElements after replaceAll  ");
        names.forEach(i -> System.out.print(i + ", "));

        // Delete Operation
        //1. Remove by index
        names.remove(0);
        System.out.println("\nValue at index zero after removal : " + names.get(0));

        // 2. remove all data
        names.clear();
        names.forEach(i -> System.out.print(i + " "));
    }
}
