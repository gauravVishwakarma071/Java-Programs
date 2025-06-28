package com.access_modifiers.shcool;

public class Student {

    private String name;// This is a private member which is ristricted to inside the class. We use public getter?setter to access the value of it.
    public int rollNum;// This is a public member that can be accessed anywhere inside/outside of class/package.

    public String getname(){
      return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void StdInfo(){
        System.out.println(name);
        System.out.println(rollNum);
    }

}
