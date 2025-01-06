package com.huaxiti;

public class ThreadSyn implements Runnable {
    private volatile static int count = 0;
    @Override
    public void run() {
        method();
    }

    public synchronized static void method() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " count :" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
