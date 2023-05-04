package com.huaxiti.Niuke.weipinghui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AaddB {


    public static void main(String[] args) {
//        System.out.println(add("1101", "1100"));
        String a = "1101";
        char[] chars = a.toCharArray();
        int i = chars[0] ;
        System.out.println(i);
    }
    public static String add(String a, String b){
        String[] split = a.split("");
        String[] split1 = b.split("");

        int len = 0;
        if (split.length>=split1.length){
            len = split.length;
        }else {
            len = split1.length;
        }
        List<String> list = new ArrayList<String>();
        int flag = 0;
        for (int i = len-1; i > 0; i--) {
            if ((split[i].equals("1") && split1[i].equals("0")) || (split[i].equals("0") && split1[i].equals("1"))){
                if (flag==0) {
                    list.add(i, "1");
                }else {
                    flag=0;
                    list.add(i,"0");
                    flag=1;
                }

            }else if (split[i].equals("0") && split1[i].equals("0")){
                if (flag==0) {
                    list.add(i, "0");
                }else {
                    list.add(i,"1");
                    flag=0;
                }
            }else if (split[i].equals("1") && split1[i].equals("1")){
                if (flag==0) {
                    list.add(i, "0");
                    flag=1;
                }else {
                    flag=0;
                    list.add(i, "1");
                    flag=1;
                }
            }
        }

        return list.toString();
    }

}
