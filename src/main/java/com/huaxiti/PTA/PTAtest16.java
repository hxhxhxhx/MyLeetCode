package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int a,b,c;
        int flag = 0;
        if (i > 0 && i <= 6) {
            for (a = i; a < i + 4; a++) {
                for (b = i; b < i + 4; b++) {
                    for (c = i; c < i + 4; c++) {
                        if (a != b && a != c && b != c) {
                            if (a != b || b != c || a != c) {
                                flag++;
                                if (flag == 6) {
                                    System.out.printf("%d%d%d", a, b, c);
                                    System.out.println();
                                    flag = 0;
                                }else {
                                    System.out.printf("%d%d%d ", a, b, c);
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}
