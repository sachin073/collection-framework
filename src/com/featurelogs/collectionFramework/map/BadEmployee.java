package com.featurelogs.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Demo for red-black tree structure induction
*/
public class BadEmployee {
	String name;
	int id;

	public BadEmployee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BadEmployee user = (BadEmployee) o;
		return id == user.id && name.equals(user.name);
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public String toString() {
		return "BadEmp{" + id + " " + name + '}' + " ";
	}
	
	public static void main(String[] args) {
		
		Map<BadEmployee, Integer> emps = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			emps.put(new BadEmployee("EMP_NUM-"+i, i), 1);
		}
	}
	
}
