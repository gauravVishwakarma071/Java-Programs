package com.access_modifiers.shcool;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("Mohan Pyare");
        s2.rollNum = 23;
        s1.StdInfo();

        s2.setName("SOhan LAL");
        s2.rollNum = 24;
        s2.StdInfo();
    }
}
