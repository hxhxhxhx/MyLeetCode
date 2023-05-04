package com.huaxiti.JUC.Thread.demo2;



public class Demo2 {
    public static void main(String[] args) {
        Ticket2 ticket = new Ticket2();
        new Thread(() -> {
            for (int i = 0; i < 80; i++) {
                ticket.sale();
            }
        },"C").start();
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
