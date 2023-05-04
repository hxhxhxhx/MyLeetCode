package com.huaxiti.Niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntFunction;

public class test1025 {
    public static void main(String[] args) {
        int num = 5;
        String s = "1 2 3 4 5";
        Countnum(num,s);
    }

    public static void Countnum(int i ,String s){
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        StringBuffer sb = new StringBuffer();
        int result =0;
        sb.append(Integer.parseInt(s1[0])+" ");
        for (int j = 1; j < i; j++) {
            for (int k = 0; k < j; k++) {
                int next = Integer.parseInt(s1[j]);
                int pre = Integer.parseInt(s1[j - 1]);
                if (next>pre){
                    result = next + pre;
                }
            }
            sb.append(result+" ");
        }
        System.out.println(sb.toString());
    }
}
