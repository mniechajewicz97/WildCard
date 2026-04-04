package org.example;

public class Person {
    private String name;
    private String lastName;
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return name + " " +  lastName;
    }
}
