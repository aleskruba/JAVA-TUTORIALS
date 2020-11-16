package com.dokram;

public class Girl extends Boy {

    private int children;

    public Girl(String name, int age, int children) {
        super(name, age);
        this.children = children;
    }

    public void info() {
        System.out.println(" I am a girl , my name is " + this.name + ". I am " + this.age +" I have " + this.children);
    }
}
