package com.huaxiti.JUC.Thread.concurrent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;

public class Demo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        fun1 f1 = new fun1("fun1");
        f1.start();
//        f1.join();
        System.out.println(f1.getValue());
        fun2 f2 = new fun2("fun2");
        Thread.sleep(1000);
        new Thread(f2).start();
        System.out.println(f2.getValue());

        fun3 f3 = new fun3("fun3");
        FutureTask<String> f = new FutureTask<String>(f3);
        new Thread(f).start();
        System.out.println(f.get());
        System.out.println(f3.getValue());

        //4.
        fun3 f4 = new fun3();
        List<String> list = new ArrayList<>();
        new Thread(() ->{
            String value = f3.getValue();
            list.add("value");
            f4.setValue("f4");
        }).start();
        Thread.sleep(1000);
        System.out.println("fun4" + list);
        System.out.println("fun5" + f4.getValue());

        System.out.println("-------------");
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.submit(f2);
        executor.submit(f1);
        Future<String> sb = executor.submit(f3);
        System.out.println(sb.get());
        executor.shutdown();
    }

    public void thread1() throws InterruptedException {
        fun2 fun2 = new fun2("________123");
        fun2.wait(2000);
        new Thread(fun2).start();
    }
}
