package com.featurelogs.basics.equals;

public class EqualsDemo {

    public static void main(String[] args) {

        //1. Primary data type equality
        System.out.println("1. Primary data type equality");
        System.out.println("int equality: 1==1 : " + (1 == 1));
        System.out.println("character equality A==A : " + ('A' == 'A'));
        System.out.println("character to int equality  A==65 : " + ('A' == 65));
        System.out.println("boolean equality  true==true : " + (true == true));

        //2. Boxed Integer type comparision
        System.out.println("1. Boxed data type equality");
        System.out.println("Boxed with unboxed type equality: " + (new Integer(1) == new Integer(1)));
        System.out.println("Boxed with unboxed type equality: " + (new Integer(1) == 1));
        System.out.println("Boxed with unboxed type equality with .equal() : " + (new Integer(1).equals( new Integer(1))));

    }

}
