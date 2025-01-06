package com.huaxiti.DesignModle.factory;

public class Pizza {

    public static void main(String[] args) {
        int i = 1;
        String result = "0";
        String num = "2";
        while (i <= 4){
            i = 2*i;
            result = chen(num,num);
            num = result;
        }
        System.out.println(result);
    }

    private static String chen(String a, String b){
        int yu = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=a.length(); i++){
            char c = a.charAt(a.length() - i);
            int anum = a.charAt(a.length()-i);
            int bnum = b.charAt(b.length()-i);
            int result = anum * bnum;
            sb.append(result+yu);
            yu = result % 10;
        }
        if (yu != 0){
            sb.append(yu);
        }
        return sb.reverse().toString();
    }

    private static String jian(String a, String b){
        int jie = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= b.length(); i++){
            int anum = a.charAt(a.length()-i);
            int bnum = b.charAt(b.length()-i);
            if (anum < bnum+jie){
                sb.append(anum-bnum+10-jie);
                jie = 1;
            }else {
                sb.append(anum - bnum -jie);
                jie = 0;
            }
        }
        if (jie != 0){
            int an = a.charAt(a.length() - b.length() - 1);
            sb.append(an-jie);
        }
        String substring = a.substring(0, a.length() - b.length() - 1);
        return substring+sb.reverse();
    }
}
