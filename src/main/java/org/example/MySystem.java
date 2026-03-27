package org.example;

public class MySystem<T> {
    private T value;

    public MySystem(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
