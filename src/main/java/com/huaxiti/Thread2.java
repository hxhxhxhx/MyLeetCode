package com.huaxiti;

public class Thread2 extends Thread{
    @Override
    public void run() {
        ThreadDemo threadDemo = new ThreadDemo();
        try {
            System.out.println(threadDemo.toString());
            threadDemo.testGlobalConstant("thread2");
            System.out.println("thread2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
