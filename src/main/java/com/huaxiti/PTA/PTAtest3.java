package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = String.valueOf(i);
        while(s.length()<3){
            s = new StringBuilder(s).insert(0,"0").toString();
        }
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        System.out.println(Integer.parseInt(s1));
    }
}
