package com.huaxiti.JUC.Thread.concurrent;

public class fun2 implements Runnable{
    private String value;

    public fun2(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void run() {
        System.out.println(value);
    }
}
