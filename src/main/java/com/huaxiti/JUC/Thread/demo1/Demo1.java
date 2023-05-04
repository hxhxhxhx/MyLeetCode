package com.huaxiti.JUC.Thread.demo1;

import java.util.concurrent.Callable;

public class Demo1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 80; i++) {
                ticket.sale();
            }
        },"C").start();
        int j = 0;
        new Thread(() -> {
            for (int i = 0; i < 80; i++) {
                ticket.sale();

            }
        },"A").start();

        new Thread(() -> {
            for (int i = 0; i < 80; i++) {
                ticket.sale();
            }
        },"B").start();


    }

}
