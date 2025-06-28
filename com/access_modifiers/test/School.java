package com.access_modifiers.test;

//We can create only one object of school by this way.
public class School {

    private static School instance;

    private School(){
    }

    public static School createObject(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }
}
