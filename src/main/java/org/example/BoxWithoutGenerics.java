package org.example;

public class BoxWithoutGenerics {
    private Object value;

    public BoxWithoutGenerics() {
    }

    public BoxWithoutGenerics(Object value) {

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
