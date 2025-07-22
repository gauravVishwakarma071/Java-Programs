package com.generic;

public class GenericContainer<T> implements Container<T> {

    @Override
    public void add(T item) {
    }

    @Override
    public T get() {
        return null;
    }

    public static void main(String[] args) {
        GenericContainer<String> gC = new GenericContainer<>();
        gC.add("Gaurav");


        String name = (String) gC.get();
        System.out.println(name);
        System.out.println(gC.get());
    }
}
