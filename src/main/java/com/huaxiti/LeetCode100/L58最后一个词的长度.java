package com.huaxiti.LeetCode100;

public class L58最后一个词的长度 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  aaaa  dddd "));
    }
    public static int lengthOfLastWord(String s) {
        int l = s.length();
        for(int i = l-1; i > 0; i--){
            if(!String.valueOf(s.charAt(i)).equals(" ")){
                s = s.substring(0,i+1);
                break;
            }
        }
        for(int i = s.length()-1; i > 0; i--){
            if(String.valueOf(s.charAt(i)).equals(" ")){
                return s.length()-i-1;
            }
        }
        return s.length();
    }
}
