package com.huaxiti.LeetCode100;


//leetcode submit region begin(Prohibit modification and deletion)
class L13罗马数转整数 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        char[] sc = s.toCharArray();
        int result = 0;
        for(int i = 0; i < sc.length; i ++){
            if (i != sc.length-1) {
                int res = convertL(sc[i] +""+ sc[i+1]);
                if (res == 0){
                    result += convertM(String.valueOf(sc[i]));
                }else {
                    result += res;
                    i++;
                }
            }else {
                int res = convertL(sc[i]+""+sc[i]);
                if (res == 0){
                    result += convertM(String.valueOf(sc[i]));
                }else {
                    result += res;
                    i++;
                }
            }
        }
        return result;
    }

    public static int convertL(String a){
        switch (a){
            case "IV" :
                return 4;
            case "IX" :
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }

    public static int convertM(String a){
        switch (a){
            case "I" :
                return 1;
            case "V" :
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
