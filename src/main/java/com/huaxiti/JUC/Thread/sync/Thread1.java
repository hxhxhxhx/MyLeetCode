package com.huaxiti.JUC.Thread.sync;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Entity1.test3();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
