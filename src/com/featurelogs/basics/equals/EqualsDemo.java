package com.featurelogs.basics.equals;

public class EqualsDemo {

	public static void main(String[] args) {

		// 1. Primary data type equality
		System.out.println("1. Primary data type equality");
		System.out.println("int equality: 1==1 : " + (1 == 1)); // true: equal primitive values
		System.out.println("character equality A==A : " + ('A' == 'A')); // true: equal primitive values
		System.out.println("character to int equality  A==65 : " + ('A' == 65)); // true: equal primitive values in byte code
		System.out.println("boolean equality  true==true : " + (true == true));  // true: equal primitive values

		// 2. Wrapper classes types equality
		System.out.println("1. Boxed data type equality");
		System.out.println("Boxed type equality: " + (new Integer(1) == new Integer(1))); // false: difference in reference
		System.out.println("Boxed with unboxed type equality: " + (new Integer(1) == 1)); // true : auto unboxing converted object to primitive
		System.out.println("Boxed with unboxed type equality with .equal() : " + (new Integer(1).equals(new Integer(1)))); // true: equal value
		
		System.out.println("Interger caching equality with == : " + (Integer.valueOf(122)==Integer.valueOf(122))); // true: integer caching till 127
		System.out.println("Interger caching equality with == : " + (Integer.valueOf(128)==Integer.valueOf(128))); // true: integer caching till 127

	}
}
