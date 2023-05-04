package com.huaxiti.DesignModle.adapter;

public class Computer {
    public void net(NetToUsb netToUsb){
        netToUsb.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

        computer.net(adapter);
    }
}
