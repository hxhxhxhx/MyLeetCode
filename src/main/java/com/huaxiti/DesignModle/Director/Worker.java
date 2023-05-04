package com.huaxiti.DesignModle.Director;

public class Worker extends Builder {
    private Product product;

    public Worker(){
        product = new Product();
    }
    @Override
    void builderA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void builderB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void builderC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void builderD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
