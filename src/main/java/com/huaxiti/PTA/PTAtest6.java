package com.huaxiti.PTA;

import java.util.Scanner;

public class PTAtest6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a1, a2;
        int b;
        char c;
        a1 = in.nextFloat();
        b = in.nextInt();
        c = in.next().charAt(0);
        a2 = in.nextFloat();
        System.out.printf("%c %d %.2f %.2f", c, b, a1, a2);

    }

}