package com.huaxiti.DesignModle.Direct2;

public class test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.buildB("鸡块")
                .getBuild();
        System.out.println(product.toString());
    }
}
