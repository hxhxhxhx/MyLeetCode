package com.huaxiti.JUC.Thread.sync;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        Entity1 e1 = new Entity1();
        try {
            for (int i = 0; i < 5; i++) {
                e1.test4();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
