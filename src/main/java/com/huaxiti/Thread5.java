package com.huaxiti;

public class Thread5 implements Runnable{
    private CountNum countNum;

    public Thread5 setCountNum(CountNum countNum) {
        this.countNum = countNum;
        return this;
    }

//    public Thread3(CountNum countNum){
//        this.countNum = countNum;
//    }
    @Override
    public void run() {
        System.out.println(countNum);
    }
}
