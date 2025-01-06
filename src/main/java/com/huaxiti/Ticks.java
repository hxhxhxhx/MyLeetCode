package com.huaxiti;

public class Ticks implements Runnable{
    private int tickNum = 10;
    @Override
    public void run() {
        while (true){

            if (tickNum <= 0){
                break;
            }
            try {
                Thread.sleep(200);
                tickNum +=1;
                System.out.println(Thread.currentThread().getName() + "-->拿到了第" + tickNum + "票");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Ticks ticks = new Ticks();
        new Thread(ticks, "小明").start();
        new Thread(ticks, "老师").start();
        new Thread(ticks, "黄牛党").start();
    }
}