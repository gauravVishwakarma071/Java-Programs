package com.access_modifiers.test;

import com.access_modifiers.shcool.Student;

public class Test {
    public static void main(String[] args) {
        School.createObject();
        Student s1 = new Student();
        s1.setName("KOLANDU");
        s1.rollNum = 25;
        s1.StdInfo();
    }
}

