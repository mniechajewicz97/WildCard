package org.example;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {
    private List<T> elements = new ArrayList<>();

    public Warehouse() {

    }
    public void addElement(T element) {
        elements.add(element);
    }
    public void printElements() {
        if (elements.isEmpty()) {
            System.out.println("Warehouse is empty");
        } else {
            System.out.println(elements);
        }
    }
    public Integer getNumberOfElements() {
        if (elements.isEmpty()) {
            return 0;
        }
        return elements.size();
    }
    public T getLastElement() {
        if  (elements.isEmpty()) {
            return null;
        }
       return elements.get(elements.size() - 1);
    }
}
