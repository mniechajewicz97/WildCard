package org.example;

import java.util.ArrayList;
import java.util.List;

public class BoxWithoutGenerics<T> {
    private List<T> list = new ArrayList<>();

    public List<T> getValue() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
