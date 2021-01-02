package com.featurelogs.collectionFramework.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> simpleMap = new TreeMap<>();
		TreeMap<Employee, String> employeeMap = new TreeMap<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {

				if (o1.id - o2.id < 0) {
					return -1;
				} else if (o1.id - o2.id > 0) {
					return 1;
				} else {
					return o1.name.compareTo(o2.name);
				}
			}
		});

		// insertion
		simpleMap.put(1, "Max");
		simpleMap.put(2, "Sid");
		simpleMap.put(3, "Ravi");
		simpleMap.put(4, "Tej");

		employeeMap.put(new Employee("Ravi", 1), "first employee");
		employeeMap.put(new Employee("Manoj", 2), "2nd employee");
		employeeMap.put(new Employee("Kevin", 3), "thrid employee");

		// Reading
		System.out.println("\n-----Reading tree map-----");
		System.out.println("simple map :: " + simpleMap);
		System.out.println("employee map :: " + employeeMap);

		// delete key
		simpleMap.remove(1);
		employeeMap.remove(new Employee("Manoj", 2));

		// Reading
		System.out.println("\n-----Reading tree map after removal-----");
		System.out.println("simple map :: " + simpleMap);
		System.out.println("employee map :: " + employeeMap);

		// finding node greater or less than key
		System.out.println("\n---finding node greater or less than key----");
		
		System.out.println("find node less or equal to 5 in simple map: " + simpleMap.floorEntry(5));
		System.out.println("find node greater or equal to 1 in simple map : " + simpleMap.ceilingEntry(1));
		
		// finding min and max node
		System.out.println("\n---finding min and max node----");

		System.out.println("find max node in simple map: " + simpleMap.lastEntry());
		System.out.println("find min node in simple map: " + simpleMap.firstEntry());
		
		// Get reverse order 
		System.out.println("\n---Get reverse order----");
		System.out.println("reverse simple map : " + simpleMap.descendingMap());
		System.out.println("reverse employee map :" + employeeMap.descendingMap());
		
	}
}