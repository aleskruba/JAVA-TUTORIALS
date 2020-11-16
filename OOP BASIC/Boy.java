package com.dokram;

public class Boy {
    public String name;
    public int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void info() {
        System.out.println(" I am a boy. my name is " + this.name + ". I am " + this.age);
    }
        public int getAge() {
            return this.age;
        }

       public void setAge(int age) {
        this.age = age;

    }
}
