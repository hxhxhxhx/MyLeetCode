package com.serial;

import java.io.Serializable;

public class Student1 implements Serializable {

    private String name;

    private int age;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student1(){}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
