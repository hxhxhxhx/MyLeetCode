package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int next = sc.nextInt();
        if(next>=0 && next<=500){
            if(next>60){
                System.out.println("Speed: " + next + " - Speeding");
            }else {
                System.out.println("Speed: " + next + " - OK");
            }
        }else{
            System.out.println("请输入一个1-500之间的数");
        }

    }



}
