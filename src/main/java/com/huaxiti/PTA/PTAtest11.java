package com.huaxiti.PTA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PTAtest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double money = 0;
        if(i<=15 && i >=0){
            money = 4 * i / 3;
        }else if(i >15){
            money = 2.5 * i - 17.5;
        }else {
            System.out.println("输入有误");
            return;
        }
        DecimalFormat df =new DecimalFormat("#0.00");
        System.out.println(df.format(money));
    }
}
