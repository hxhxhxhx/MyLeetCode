package com.huaxiti.schoolTest;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < 3; i++){
            result = result + "score" + (i+1) + "=" + arr[i] + ",";
        }
        System.out.println(result.substring(0, result.length() - 1));

    }
}
