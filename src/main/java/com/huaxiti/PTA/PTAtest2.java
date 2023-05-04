package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hf = sc.next();
        StringBuilder sb = new StringBuilder(hf);
        int len = hf.length();
        while(len<4){
            sb.insert(0, "0");
            len++;
        }
        int f = sc.nextInt();
        int shi = Integer.parseInt(sb.substring(0, 2));
        int fen = Integer.parseInt(sb.substring(2));

        int result_f = fen + f;
        if(result_f>60){
            shi += result_f/60;
            result_f -= (result_f/60)*60;
        }
        if(result_f<0){
            shi = shi + result_f/60 -1;
            result_f = 60 + result_f%60;
        }
        String result_shi = String.valueOf(shi);
        StringBuilder rsb = new StringBuilder(String.valueOf(result_f));
        if(result_f<2){
            rsb.insert(0,"0");
        }
        String result = result_shi + rsb;
        System.out.println(result);
    }
}
