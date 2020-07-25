package com.featurelogs.basics.equals;

public class UsersComparision {

    public static void main(String[] args) {

        User max = new User("max", 1, "Computers");
        User maxClone = new User("max", 1, "Computers");

        User maxElectrical = new User("max", 1, "Electrical");

        System.out.println("Are max and maxclone are same object? : " + (max == maxClone)); 
        // false: Different object referenced

        System.out.println("Are max and maxclone are equal Object? : " + max.equals(maxClone)); 
        // true : Properties are same which are getting checked in equals method of User class

        System.out.println("Is maxElectrical and max are same? : " + max.equals(maxElectrical)); 
        // false: Dept is different

    }
}
