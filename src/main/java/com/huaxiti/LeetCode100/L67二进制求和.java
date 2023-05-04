package com.huaxiti.LeetCode100;

public class L67二进制求和 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "101"));
    }
    public static String addBinary(String a, String b) {
        int temp = 0;
        int al = a.length();
        int bl = b.length();
        if (al > bl){
            for (int i = 0; i < al -bl; i++){
                b = "0" + b;
            }
        } else if (bl > al) {
            for (int i = 0; i < bl -al; i++){
                a = "0" + a;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = a.length()-1; i >= 0; i--){
            int res = add(a.charAt(i),b.charAt(i),temp);
            if(res == 2){
                temp = 1;
                sb.append("0");
            }else if(res == 1){
                sb.append("1");
                temp = 0;
            }else if(res == 0){
                sb.append("0");
                temp = 0;
            }else if (res == 3){
                temp = 1;
                sb.append("1");
            }
        }
        if(temp == 1){
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    private static int add(char a, char b, int temp){
        if (a == '1' && b == '1'){
            return 2 +temp;
        }else if (a == '0' && b == '1'){
            return 1 +temp;
        }else if (a == '1' && b == '0'){
            return 1 +temp;
        }else if (a == '0' && b == '0'){
            return temp;
        }
        return 0;
    }
}
