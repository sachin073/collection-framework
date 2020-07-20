package com.featurelogs.basics.equals;

import java.util.Objects;

public class User implements Comparable<User>{
    String name;
    int roll;
    String dept;

    public User(String name, int roll, String dept) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public int compareTo(User user) {
        if (this.roll > user.roll)
            return 1;
        else if (this.roll < user.roll)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return roll == user.roll &&
                name.equals(user.name) &&
                dept.equals(user.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll,dept);
    }

    @Override
    public String toString() {
        return "User{" + roll +" "+ name +'}'+" ";
    }
}
