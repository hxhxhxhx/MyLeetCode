package com.huaxiti;

public class Thread3 implements Runnable{
    private CountNum countNum;

    public Thread3 setCountNum(CountNum countNum) {
        this.countNum = countNum;
        return this;
    }

//    public Thread3(CountNum countNum){
//        this.countNum = countNum;
//    }
    @Override
    public void run() {

        synchronized (countNum) {
            System.out.println(countNum);
            if (countNum.getNum() < 30) {

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                countNum.setNum(countNum.getNum()+1);
                System.out.println("threadName: " + Thread.currentThread().getName() + ", num : " + countNum.getNum());
            }
        }
//        ThreadDemo threadDemo = new ThreadDemo();
//        System.out.println(threadDemo.toString());
//        try {
//            threadDemo.testThread();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
