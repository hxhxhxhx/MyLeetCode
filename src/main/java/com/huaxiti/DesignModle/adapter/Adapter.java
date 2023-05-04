package com.huaxiti.DesignModle.adapter;

public class Adapter implements NetToUsb{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
