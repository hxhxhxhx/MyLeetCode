package com.huaxiti.JUC.Thread.concurrent;

public class fun1 extends Thread{

    private String value;

    public fun1(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    @Override
    public void run(){
        System.out.println(value);
    }
}
