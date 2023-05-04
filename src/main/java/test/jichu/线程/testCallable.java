package test.jichu.线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class testCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask f1 = new FutureTask<>(new myRun1());
        FutureTask f2 = new FutureTask<>(new myRun2());
        FutureTask f3 = new FutureTask<>(new myRun3());
        new Thread(f1, "线程1").start();
        new Thread(f2, "线程2").start();
        new Thread(f3, "线程3").start();
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

    }

    static class myRun1 implements Callable{

        @Override
        public Integer call() throws Exception {
            System.out.println("this is call1");
            return 1;
        }
    }

    static class myRun2 implements Callable{

        @Override
        public Integer call() throws Exception {
            System.out.println("this is call2");
            return 2;
        }
    }

    static class myRun3 implements Callable{

        @Override
        public Integer call() throws Exception {
            System.out.println("this is call3");
            return 2/0;
        }
    }
}
