package com.huaxiti.LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class L快乐数 {
    public static void main(String[] args) {
        System.out.println(test1(19));
    }

    public static Boolean test1(int num){
        if (num ==0) return false;
        while (true){
            num = test(num);
            if (num == 1){
                return true;
            }
            if (num ==4){
                return false;
            }
        }

    }
    public static int test(int num){

        int m = (int) Math.pow(num % 10, 2);
        num /= 10;

        if (num ==0){
            return m;
        }else {
            return m+test(num);
        }
    }
}
