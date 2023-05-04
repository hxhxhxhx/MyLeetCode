package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String[] split = next.split(":");
        int i = Integer.parseInt(split[0]);
        int s = Integer.parseInt(split[1]);
        if(s<0 || s>60){
            System.out.println("请输入24小时制时间");
            return;
        }
        String result=null;
        if(i<12){
            result = i + ":" + split[1] + " AM";
        }else if (i==12){
            result = i + ":" + split[1] + " PM";
        }else if(i>12 && i<24) {
            i -= 12;
            result = i + ":" + split[1] + " PM";
        }else if(i==24 || i==0){
            result = 0 + ":" + split[1] + " AM";
        }else {
            System.out.println("请输入24小时制时间");
        }
        System.out.println(result);
    }
}
