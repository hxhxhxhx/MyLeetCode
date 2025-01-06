package com.huaxiti;

import java.util.Collections;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        ThreadSyn threadSynOne = new ThreadSyn();
        ThreadSyn threadSynTwo = new ThreadSyn();
        Thread thread1 = new Thread(threadSynOne,"ThreadSynOne");
        Thread thread2 = new Thread(threadSynTwo,"ThreadSynTwo");
        thread1.start();
        thread2.start();

//
//        CountNum countNum = new CountNum();
//        countNum.setName("111");
//        Thread5 thread5 = new Thread5();
//        thread5.setCountNum(countNum);
//        new Thread(thread5).start();
//
//        System.out.println(countNum+"ff");
////        System.out.println(countNum.getClass());
////        System.out.println(countNum.hashCode());
//
//
//        CountNum countNum1 = new CountNum();
//        countNum1.setName("222");
//        System.out.println(countNum1+"ff");
//
//
//        thread5.setCountNum(countNum1);
//        new Thread(thread5).start();
    }

}
