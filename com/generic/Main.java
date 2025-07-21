package com.generic;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);
    }
}
