package com.huaxiti.JUC.Thread.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket2 {
    private int number = 80;
    Lock lock = new ReentrantLock();
    public void sale(){
        lock.lock();
        try {
            if (number>0) {
                System.out.println(Thread.currentThread().getName() + "卖出了" + (number--) + "张票，还剩" + number + "张");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
