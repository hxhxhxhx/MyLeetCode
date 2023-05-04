package com.huaxiti.JUC.Thread.sync;

public class Entity1 {

    private String name;
    private int age;

    public Entity1() {
    }

    public Entity1(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public static void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test1");
    }

    public void test2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test2");
    }

    public synchronized static void test3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test3");
    }

    public synchronized void test4() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test4");
    }
}
