package com.huaxiti.LeetCode;

public class L28_实现strStrorIndexOf {

    public static void main(String[] args) {
        int i = strStr("hello", "");
        System.out.println(i);
    }
    public static int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        char c = needle.charAt(i);

        if (needle==null||(needle==null&&haystack==null)){
            return 0;
        }else {
            for (; j < haystack.length(); j++) {
                if (i < needle.length()) {
                    char c1 = haystack.charAt(j);
                    if (c == c1) {
                        i++;
                    }
                    if (i != 0 && c != c1) {
                        i = 0;
                    }
                }else {
                    return j - needle.length();
                }
            }
            return -1;
        }



    }
}
