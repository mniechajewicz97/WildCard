package org.example;

public class Box<T> { // czyli Type
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
