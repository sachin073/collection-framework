package com.featurelogs.collectionFramework.map;

import java.util.Objects;

public class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Getter and Setters

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee user = (Employee) o;
		return id == user.id && name.equals(user.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id);
	}

	@Override
	public String toString() {
		return "Emp{" + id + " " + name + '}' + " ";
	}
}
