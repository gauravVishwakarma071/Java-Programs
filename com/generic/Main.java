package com.generic;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        box.setValue(1);
        int i = (Integer)box.getValue();
        System.out.println(i);
    }
}
