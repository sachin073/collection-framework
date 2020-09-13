package com.featurelogs.collectionFramework.map;

import java.util.Map;
import java.util.Map.Entry;

public class HashMap {
	
	public static void main(String[] args) {
		
		// Map declaration
		Map<String, String> map = new java.util.HashMap<String, String>();
		Map<String, Employee> employees = new java.util.HashMap<>();
		Map<Employee, Employee> managerMapping = new java.util.HashMap<>();
		
		
		//insert or update data		
		map.put("first-name", "john");
		map.put("last-name", "doe");
		
		employees.put("IT-MGR", new Employee("John", 1));
		employees.put("IT-emp-01", new Employee("Max", 101));
		
		managerMapping.put(new Employee("John", 1), new Employee("Max", 101));
		
		// Read
		System.out.println("find IT-MGR in employees :"+ employees.get("IT-MGR"));
		
		// get keys only
		System.out.println(" Keys-set : " +map.keySet());
		
		// get values only
		System.out.println(" values-set : " +map.values());
		
		
		// iterate on one key-value pair
		for (Entry<String, Employee> emp : employees.entrySet()) {
			System.out.println(" Key : " +emp.getKey() + " | value : "+emp.getValue());
		}
		
		// remove
		employees.remove("IT");
		
		
	}

}
