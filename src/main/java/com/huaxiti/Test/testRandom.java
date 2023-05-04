package com.huaxiti.Test;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class testRandom {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(50));
        System.out.println(r.nextBoolean());
        System.out.println("-------------");

        ThreadLocalRandom t = ThreadLocalRandom.current();
        System.out.println(t.nextInt(10));
        System.out.println("-----------");

        String s = UUID.randomUUID().toString();
        System.out.println(s);

        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
        InheritableThreadLocal<Object> objectInheritableThreadLocal = new InheritableThreadLocal<>();

    }
}
