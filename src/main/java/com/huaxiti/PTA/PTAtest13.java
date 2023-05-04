package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Open = sc.nextDouble();
        double High = sc.nextDouble();
        double Low = sc.nextDouble();
        double Close = sc.nextDouble();

        if (Close<Open && High > Open && High > Close && Low < Open && Low < Close){
            System.out.println("BW-Solid with Lower Shadow and Upper Shadow");
        }else if(Close>Open && High > Open && High > Close && Low < Open && Low < Close){
            System.out.println("R-Hollow with Lower Shadow and Upper Shadow");
        }else if (Close==Open && High > Open && High > Close && Low < Open && Low < Close){
            System.out.println("R-Cross with Lower Shadow and Upper Shadow");
        }else if (Close<Open && Low < Open && Low < Close){
            System.out.println("BW-Solid with Lower Shadow");
        }else if(Close>Open && Low < Open && Low < Close){
            System.out.println("R-Hollow with Lower Shadow");
        }else if (Close==Open && Low < Open && Low < Close){
            System.out.println("R-Cross with Lower Shadow");
        }else if (Close<Open && High > Open && High > Close){
            System.out.println("BW-Solid with Upper Shadow");
        }else if(Close>Open && High > Open && High > Close){
            System.out.println("R-Hollow with Upper Shadow");
        }else if (Close==Open && High > Open && High > Close){
            System.out.println("R-Cross with Upper Shadow");
        }else if (Close<Open){
            System.out.println("BW-Solid");
        }else if(Close>Open){
            System.out.println("R-Hollow");
        }else if (Close==Open){
            System.out.println("R-Cross");
        }
    }
}
