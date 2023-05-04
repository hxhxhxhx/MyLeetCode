package com.huaxiti.DesignModle.Director;

abstract class Builder {
    abstract void builderA();
    abstract void builderB();
    abstract void builderC();
    abstract void builderD();

    //完工：得到产品
    abstract Product getProduct();
}
