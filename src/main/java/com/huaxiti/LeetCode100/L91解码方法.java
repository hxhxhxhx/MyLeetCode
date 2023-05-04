package com.huaxiti.LeetCode100;

public class L91解码方法 {
    public static void main(String[] args) {
        System.out.println(numDecodings("12"));
    }
    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            char a = s.charAt(i-1);
            char b = s.charAt(i-2);
            if ( a > '0' && a <= '9'){
                dp[i] += dp[i-1];
            }
            if (b == '1' || b == '2' && a >= '0' && a <= '6'){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}
