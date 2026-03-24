package org.example;
import java.util.ArrayList;
import java.util.List;

public class Checklist<T> {
private List<T> elements = new ArrayList<>();

public void addElement(T element) {
    elements.add(element);

}
public void printAllElements() {
    System.out.println(elements);
}

}
