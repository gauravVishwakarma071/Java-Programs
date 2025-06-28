package com.access_modifiers.Zoo;

public class Animal {
    private String name;
    protected String sound;

    public Animal(String name, String barKs){
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name+ " is " + sound);
    }

    protected void changeSound(String newSound){
        this.sound = newSound;
    }
}
