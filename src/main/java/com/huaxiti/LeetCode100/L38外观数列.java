package com.huaxiti.LeetCode100;

import java.util.HashMap;
import java.util.Map;

public class L38外观数列 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        String num = "1";
        for(int i = 2; i <= n; i++){
            int start = 0;
            int pos = 0;
            StringBuilder sb = new StringBuilder();
            while (pos < num.length()){
                while(pos < num.length() && num.charAt(start) == num.charAt(pos)){
                    pos++;
                }
                sb.append(String.valueOf(pos - start)).append(num.charAt(start));
                start = pos;
            }
            num = sb.toString();
        }

        return num;
    }
}
