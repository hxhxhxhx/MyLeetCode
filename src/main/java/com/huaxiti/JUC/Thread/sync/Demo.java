package com.huaxiti.JUC.Thread.sync;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();


//        new demo1().test2();
    }
}
