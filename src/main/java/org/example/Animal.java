package org.example;

public class Animal<T, U> {
    private T value;
    private U value2;

    public Animal(T value, U value2) {
        this.value = value;
        this.value2 = value2;

    }
    public T getValue() {
        return value;
    }
    public U getValue2() {
        return value2;
    }

}
