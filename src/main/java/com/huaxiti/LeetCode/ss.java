package com.huaxiti.LeetCode;

import java.util.ArrayList;

public class ss {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525522135"));
    }
    public static String restoreIpAddresses (String ipStr) {
        StringBuffer sb = new StringBuffer();
        String s ="";
        for(int i = 0; i < 3; i++) {
            s = ipStr.substring(3*i, 3*i+3);
            int num = Integer.valueOf(s);
            if (num >= 0 || num <= 255) {
                sb.append(num + ".");
            }else {
                s = ipStr.substring(3*i, 3*i+2);
                num = Integer.valueOf(s);
                sb.append(num + ".");
            }
        }
        return sb.toString();
    }
}
