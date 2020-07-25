package com.featurelogs.basics.equals;

import java.util.Objects;

public class User {
	String name;
	int roll;
	String dept;

	public User(String name, int roll, String dept) {
		this.name = name;
		this.roll = roll;
		this.dept = dept;
	}

	// Getter and Setters

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User user = (User) o;
		return roll == user.roll && name.equals(user.name) && dept.equals(user.dept);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll, dept);
	}

	@Override
	public String toString() {
		return "User{" + roll + " " + name + '}' + " ";
	}
}
