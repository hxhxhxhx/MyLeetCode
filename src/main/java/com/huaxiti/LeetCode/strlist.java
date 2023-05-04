package com.huaxiti.LeetCode;

public class strlist {
    public static void main(String[] args) {
        String str = "dsafanfvapdifiaiogfa";
        char A = 'a';
        char B = 'b';
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i = 0; i < str.length()-1; i ++){
            char re = str.charAt(i);
            if(re == A){
                sb.append(B);
                count++;
            }
            sb.append(re);
        }
        System.out.println("Result String:"+sb);
        System.out.println("A count:"+count);
    }
}
