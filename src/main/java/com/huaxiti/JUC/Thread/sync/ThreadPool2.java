package com.huaxiti.JUC.Thread.sync;

import java.util.concurrent.*;

public class ThreadPool2 {
    static ExecutorService executor1 = Executors.newFixedThreadPool(3);
    static ExecutorService executor2 = Executors.newCachedThreadPool();
    static ScheduledExecutorService executor3 = Executors.newScheduledThreadPool(3);
    static ExecutorService executor4 = Executors.newSingleThreadExecutor();
    static ThreadPoolExecutor executor = new ThreadPoolExecutor(3,5,10L,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(5));

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        for (int i = 0; i < 10; i++) {
            Future<?> thread1 = executor2.submit(() -> fun1());
//            executor3.scheduleAtFixedRate(() -> fun1(),2,3,TimeUnit.SECONDS);

        }

        for (int i = 0; i < 10; i++) {
            Future<?> thread1 = executor2.submit(() -> fun2());
//            executor1.execute(() ->fun1());
        }

//        for (int i = 0; i < 10; i++) {
//
//            executor.execute(() -> fun1());
//
//        }
//
//        for (int i = 0; i < 10; i++) {
//
//            executor.execute(() -> fun2());
//
//        }
        executor2.shutdown();

    }

    public static Object fun1(){
        try {
            Thread.sleep(2000);
            System.out.println("fun1...  " + Thread.currentThread().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Object();
    }

    public static Object fun2(){
        try {
            Thread.sleep(2000);
            System.out.println("fun2...  " + Thread.currentThread().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Object();
    }
}
