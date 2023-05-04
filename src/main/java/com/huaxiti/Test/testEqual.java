package com.huaxiti.Test;

public class testEqual {
    public static final String a = "0easy";
    public static void main(String[] args) {
        String b = "easy";
        String c = "0easy";
        String d = "0";
        String e = "0" + "easy";
        System.out.println(a==(d+b));
        System.out.println(a==c);
        System.out.println(a==e);
        System.out.println(d+b);
    }
}
