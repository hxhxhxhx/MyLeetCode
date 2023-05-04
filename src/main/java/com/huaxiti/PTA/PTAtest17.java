package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int U = sc.nextInt();
        int D = sc.nextInt();

        int time = 0;
        int hight = 0;
        if (D < U && N <= 100 && N > 0) {
            while (hight<N){
                hight+=U;
                time++;
                if(hight>=N){
                    break;
                }
                hight-=D;
                time++;
            }
            System.out.println(time);
        }
    }
}
