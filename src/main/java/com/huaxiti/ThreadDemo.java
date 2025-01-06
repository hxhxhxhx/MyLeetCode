package com.huaxiti;

public class ThreadDemo {
//    int num = 0;
    public void testGlobalConstant(String name) throws InterruptedException {

        if ("thread1".equals(name)) {

            for (int i = 0; i < 100; i++) {

                Thread.sleep(100);
                num = num + 1;
                System.out.println("threadName: "+Thread.currentThread().getName()+", "+name + ": " + num);
            }
        }
        if ("thread2".equals(name)) {

            for (int i = 0; i < 100; i++) {

                Thread.sleep(100);
                num = num + 2;
                System.out.println("threadName: "+Thread.currentThread().getName()+", "+name + ": " + num);
            }
        }
    }

    private int num = 0;
    public void testThread() throws InterruptedException {


        for (int i = 0; i < 100; i++) {

            Thread.sleep(100);
            num = num + 1;
            System.out.println("threadName: "+Thread.currentThread().getName()+", num : " + num);
        }
    }
}
