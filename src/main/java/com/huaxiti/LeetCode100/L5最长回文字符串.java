package com.huaxiti.LeetCode100;

import java.util.Arrays;

public class L5最长回文字符串 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        String resultStr = "";
        for (int i = 0; i <= len; i++){
            for (int j = i; j <= len; j++){
                String str = s.substring(i,j);
                if (str.equals(reverStr(str)) && str.length() > resultStr.length()){
                    resultStr = str;
                }
            }
        }
        return resultStr;
    }

    public static String reverStr(String s){
        int l = 0;
        int r = s.length()-1;
        char[] sc = s.toCharArray();
        while(l < r){
            char temp = sc[l];
            sc[l] = sc[r];
            sc[r] = temp;
            l++;
            r--;
        }
        return String.valueOf(sc);
    }
}
