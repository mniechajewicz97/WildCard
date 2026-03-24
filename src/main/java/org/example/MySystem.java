package org.example;

public class MySystem<T> {
    private T value;

    public MySystem() {
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

}
