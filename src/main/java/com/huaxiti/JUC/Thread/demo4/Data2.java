package com.huaxiti.JUC.Thread.demo4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Data2 {
    private int number = 1;
    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void printA() throws InterruptedException {
        lock.lock();
        try {
            while (number!=1){
                condition1.await();
            }
            number=2;
            System.out.println(Thread.currentThread().getName()+"=>AAAAAAAA");
            condition2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public  void printB() throws InterruptedException {
        lock.lock();
        try {
            while (number!=2){
                condition2.await();
            }
            number=3;
            System.out.println(Thread.currentThread().getName()+"=>BBBBBBBB");
            condition3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public  void printC() throws InterruptedException {
        lock.lock();
        try {
            while (number!=3){
                condition3.await();
            }
            number=1;
            System.out.println(Thread.currentThread().getName()+"=>CCCCCCCC");
            condition1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
