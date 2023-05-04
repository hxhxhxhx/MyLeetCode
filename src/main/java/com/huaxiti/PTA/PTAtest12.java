package com.huaxiti.PTA;


import java.util.Scanner;

public class PTAtest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String b = sc.next();
        int num2 = sc.nextInt();
        char c = b.charAt(0);
        switch (c){
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%' :
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("ERROR");
        }

    }
}
