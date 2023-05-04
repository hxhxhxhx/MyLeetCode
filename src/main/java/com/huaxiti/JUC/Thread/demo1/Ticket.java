package com.huaxiti.JUC.Thread.demo1;

public class Ticket {
    private int number = 80;

    public synchronized void sale(){
        if (number>0) {
            System.out.println(Thread.currentThread().getName() + "卖出了" + (number--) + "张票，还剩" + number + "张");
        }
    }
}
