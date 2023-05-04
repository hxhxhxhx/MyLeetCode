package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boll1 = sc.nextInt();
        int boll2 = sc.nextInt();
        int boll3 = sc.nextInt();
        
        if(boll1 != boll2 && boll1!= boll3 && boll2 != boll3){
            System.out.println("三个球重量都不等");
//            return;
        }
        if(boll1==boll2 && boll1 == boll3){
            System.out.println("三个球重量相等");
            return;
        }

        if(boll1==boll2){
            System.out.println("C");
        }else if (boll1==boll3){
            System.out.println("B");
        }else if (boll2==boll3){
            System.out.println("A");
        }
    }
}
