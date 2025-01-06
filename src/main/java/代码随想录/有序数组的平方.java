package 代码随想录;

import java.util.Arrays;

public class 有序数组的平方 {
    public static void main(String[] args) {
        int[] ints = {-4,-1,4,8};
        System.out.println(Arrays.toString(method(ints)));
    }

    private static int[] method(int[] ints){
        int l = 0; int r = ints.length-1;
        int[] result = new int[r+1];
        int k = r;
        while (l <= r){
            if (Math.abs(ints[l]) > Math.abs(ints[r])){
                result[k--] = ints[l] * ints[l];
                l++;
            }else {
                result[k--] = ints[r] * ints[r];
                r--;
            }
        }
        return result;
    }
}
