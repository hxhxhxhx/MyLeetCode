package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i;
        String[] s1 = s.split(" ");
        for (i = 0; i < s1.length - 1; i++) {
            if (s1[i].length() != 0) {
                System.out.print(s1[i].length() + " ");
            }
        }
        if (s1[i].length() != 1) {
            System.out.println(s1[i].length() - 1);
        }

    }
}
