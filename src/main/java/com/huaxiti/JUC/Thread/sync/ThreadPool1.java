package com.huaxiti.JUC.Thread.sync;

import java.util.concurrent.*;

public class ThreadPool1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,5,0, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10));
        Future<?> thread1 = executor.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("thread1...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Object o = thread1.get();

        executor.shutdown();

    }
}
