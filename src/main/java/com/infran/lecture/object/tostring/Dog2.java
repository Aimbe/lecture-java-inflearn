package com.infran.lecture.object.tostring;

public class Dog2 {
    private String dogName;
    private int age;

    public Dog2(final String dogName, final int age) {
        this.dogName = dogName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "dogName = " + dogName + ", age = " + age;
    }
}
