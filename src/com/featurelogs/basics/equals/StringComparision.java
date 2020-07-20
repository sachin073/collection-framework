package com.featurelogs.basics.equals;

public class StringComparision {
    public static void main(String[] args) {
        String litral_1 = "Bed";
        String litral_2 = "Bed";

        System.out.println(" \n --- String litral comparision ---");
        System.out.println("Self literal comparision (==): " + (litral_1 == litral_1)); // true : Same Memory ref
        System.out.println("Self literal comparision (.equal): " + litral_1.equals(litral_1)); // true : Same Memory ref & content

        System.out.println("Cross literal comparision (==): " + (litral_1 == litral_2)); // true : Same Memory ref
        System.out.println("Cross literal comparision (.equal): " + litral_1.equals(litral_2)); // true : Same Memory ref & content

        String string_1 = new String("Bed");
        String string_2 = new String("Bed");

        System.out.println(" \n --- String Object comparision ---");

        System.out.println("Cross String object comparision (==): " + (string_1 == string_2)); // false : Different Memory ref
        System.out.println("Cross String object comparision (.equal): " + string_1.equals(string_2)); // true : Different memory ref but same content ref

        System.out.println(" \n --- String Object with String litral comparision ---");
        System.out.println("object with litral comparision (==): " + (string_1 == litral_1)); // false : Different Memory ref
        System.out.println("String object comparision (.equal): " + string_1.equals(litral_1));  // true : Different memory ref but same content ref


        System.out.println(" \n --- Comparision After .intern() ---");
        string_2 = string_2.intern(); // now string_2 object will point to "Bed" litral and not to object reference
        string_1 = string_1.intern(); // now string_1 object will point to "Bed" litral and not to object reference

        System.out.println("Cross String object comparision (==): " + (string_1 == string_2)); // true : Same Memory ref
        System.out.println("Cross String object comparision (.equal): " + string_1.equals(string_2));  // true : Same Memory ref & content

        System.out.println("object with litral comparision (==): " + (string_1 == litral_1));  // true : Same Memory ref
        System.out.println("String object comparision (.equal): " + string_1.equals(litral_1));  // true : Same Memory ref & content

    }
}
