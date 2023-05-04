package com.huaxiti.JUC.Thread.demo4;



//生产者消费者问题JUC版
public class Demo4 {
    public static void main(String[] args) {
        Data2 data = new Data2();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    data.printA();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "A").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    data.printB();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    data.printC();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "C").start();
    }
}
