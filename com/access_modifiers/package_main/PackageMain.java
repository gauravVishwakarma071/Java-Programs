package com.access_modifiers.package_main;

import com.access_modifiers.Zoo.Dog;

public class PackageMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Siro");
        //dog.changeSound("Wofff Woff");//This is not accessible buz this method is protected.
        dog.changeDogSound("Wofff Woff");
        dog.wagTail();
        dog.makeSound();
    }
}

