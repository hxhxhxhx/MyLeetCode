package com.huaxiti.PTA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PTAtest10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int work_year = sc.nextInt();
        int work_time = sc.nextInt();
        double money = 0;

        if(work_year<5 && work_year>=0 && work_time<=40 && work_time>=0) {
            money = 30 * work_time;
        }else if (work_year<5 && work_year>=0 && work_time>40){
            money = 30 * 40 + (work_time - 40) * 30 * 1.5;
        }else if (work_year>=5 && work_time<=40 && work_time>=0){
            money = 50 * work_time;
        }else if (work_year>=5 && work_time>40){
            money = 50 * 40 + (work_time - 40) * 50 * 1.5;
        }else {
            System.out.println("输入有误");
            return;
        }
        DecimalFormat df =new DecimalFormat("#0.00");
        System.out.println(df.format(money));

//        BigDecimal bd = new BigDecimal(money);
//        System.out.println(bd.setScale(2));
    }
}
