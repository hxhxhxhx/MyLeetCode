package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int end = sc.nextInt();

        if (-100 <= first && first <= end && end <= 100) {
            int sum = 0;
            int flag = 0;
            for (int j = first; j <= end; j++) {
                System.out.printf("% 5d",j);

                sum += j;
                flag++;
                if (flag == 5) {
                    System.out.println();
                    flag = 0;
                }
            }
            if ((end - first + 1) % 5 != 0) {
                System.out.println();
            }
            System.out.println("Sum = " + sum);
        }else {
            System.out.println("请在一行中输入2个整数A和B，其中−100≤A≤B≤100，其间以空格分隔");
        }

    }
}
