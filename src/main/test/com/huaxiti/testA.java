package com.huaxiti;

import com.huaxiti.DesignModle.Director.Director;
import com.huaxiti.DesignModle.Director.Product;
import com.huaxiti.DesignModle.Director.Worker;

public class testA {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build.toString());


    }
}
