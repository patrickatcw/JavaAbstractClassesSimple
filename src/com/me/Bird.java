package com.me;

//step 14 create bird class
//step 15 extend
public class Bird extends Animal{

    //step 16 constructor
    public Bird(String name) {
        super(name);
    }

    //step 17 override those methods
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

        //step 18 to main

    }

}
