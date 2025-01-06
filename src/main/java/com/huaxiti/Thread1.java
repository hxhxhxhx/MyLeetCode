package com.huaxiti;

public class Thread1 extends Thread{
    @Override
    public void run() {
        ThreadDemo threadDemo = new ThreadDemo();
        try {
            System.out.println(threadDemo.toString());
            threadDemo.testGlobalConstant("thread1");
            System.out.println("thread1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
