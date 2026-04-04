package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductData<T, U> {
    private T value;
    private U value2;

    public ProductData(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public U getValue2() {
        return value2;
    }

    public void printValues() {
        System.out.println("First value: " + value + " Second value: " + value2);
    }



}
