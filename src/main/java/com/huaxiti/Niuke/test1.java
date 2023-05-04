package com.huaxiti.Niuke;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String A = sc.next();
        String B = sc.next();

        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i ++) {
            String c = String.valueOf(str.charAt(i));
            if (A.equals(c)){
                result += B;
                count++;
            }else {
                result += String.valueOf(c);
            }
        }
        System.out.println(result);
        System.out.println(count);
    }
}
