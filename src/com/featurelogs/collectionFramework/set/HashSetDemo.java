package com.featurelogs.collectionFramework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// insert/update
		
		Set<String> set = new HashSet<>();
		Set<Employee> empSet = new HashSet<>();
		// *******************Insert data*******************
		set.add("a");
		set.add("b");
		set.add("c");
		
		//Insert custom object
		empSet.add(new Employee("John", 0));
		empSet.add(new Employee("Max", 1));
		empSet.add(new Employee("John", 2));
		
		// de-duplication of objects
		set.add("a"); // add fails without exception, as object ("a") inserted is duplicate
		empSet.add(new Employee("John", 0)); // add fails without exception, as object (employee with name john & id 0 ) is duplicate
		
		
		// *************read HashSet*******************
		System.out.println("\n ****** Read from set *******");

		//looping using iterator 
		Iterator<Employee> itr= empSet.iterator();
		System.out.println("## Looping using iterator");

		while (itr.hasNext()) {
			Employee emp= itr.next();
			System.out.println(emp);
		}
		// basic for-each loop
		System.out.println("## Looping using for-each loop");
		for (Employee employee : empSet) {
			System.out.println(" employee : "+employee);
		}
		
		System.out.println("Objects in set of strings :  "+set +" | size :"+set.size());
		System.out.println("Objects in set of employee :  "+empSet+" | size :"+empSet.size());
		
		//for java 8 
		empSet.forEach(System.out::print);
		
		// *******************remove objects*******************
		System.out.println("\n ****** delte from set *******");
		
		set.remove("a");
		empSet.remove(new Employee("Max", 1));
		System.out.println("Objects in set of strings after string 'a' remove:  "+set +" | size :"+set.size());
		System.out.println("Objects in set of employee after employee 'Max' remove :  "+empSet+" | size :"+empSet.size());
		
	}

}
