package com.access_modifiers.Zoo;

public class Dog extends Animal{

    public Dog(String name) {
        super(name, "BARKs");
    }

    public void wagTail(){
        System.out.println(getName()+ " is wagging his tail...");
    }

    private String getName(){
        return getClass().getSimpleName();
    }

    public void changeDogSound(String newSound){
        changeSound(newSound);
    }
}
