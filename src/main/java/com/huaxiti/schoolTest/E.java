package com.huaxiti.schoolTest;

import java.util.HashMap;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String next = sc.next();

        String[] str = new String[i];
        str[0] = next.substring(1);
        for (int j = 1; j < i+1; j++){
            if (j<next.length()) {
                str[j] = next.substring(0, j) + next.substring(j + 1, i);
            }else {
                str[j-1]=next.substring(0, j-1);
            }
        }

        HashMap map = new HashMap();

        //取值
        for (int z = 0; z < i; z++){
            int i1 = machNumber(str[z], i);
            map.put(z,i1);
        }

        //比较
        int min = 0;
        int d;
        int end;
        for(d = 0; d < i; d++){
            int pre = (int) map.get(d);
            if (d<i-1) {
                end = (int) map.get(d + 1);
            }else {
                end = (int) map.get(i-1);
            }
            min = Math.min(pre,end);
        }
        System.out.println(min);

    }

    public static int machNumber(String s,int num){
        int resultNum = 0;
        for (int i = 0; i < num-1; i ++) {
            char c = s.charAt(i);
            resultNum += c;
        }
//        System.out.println(resultNum);
        return resultNum;
    }
}
