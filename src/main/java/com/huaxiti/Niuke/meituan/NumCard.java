package com.huaxiti.Niuke.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumCard {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.nextLine();
        String[] s1 = str.split(" ");

        if (s1[0].equals(s1[1]) && s1[1].equals(s1[2])){
            System.out.println(3);
            System.out.println(s1[0] +" "+ s1[0] +" "+ s1[0]);
        }
        List<String> list = new ArrayList<>();
        for (int a = 0; a < num; a++){
            StringBuffer sb = new StringBuffer();
            sb.append(s1[a]);
            for (int b = 0; b < num; b++){
                if(b!=a){
                    sb.append(s1[b]);
                }
                for (int c = 0; c < num; c++){
                    if (c!=a && c!=b){
                        sb.append(s1[c]);
                    }
                }
            }
            list.add(sb.toString());
        }
        for(String s : list){
            System.out.println(s);
        }


    }
}
