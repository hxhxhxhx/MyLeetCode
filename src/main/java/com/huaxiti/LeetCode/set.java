package com.huaxiti.LeetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        int i = 9876673;
        Set s = new HashSet();
        List l = new ArrayList();

        while(i!=0){
            s.add(i%10);
            i = i/10;
        }
        l.addAll(s);
        System.out.println(l.toString());
        int[] arr = new int[5];
        for(int j = 0; j<arr.length;j++) {
            System.out.println(arr[j]);
        }
    }
}
