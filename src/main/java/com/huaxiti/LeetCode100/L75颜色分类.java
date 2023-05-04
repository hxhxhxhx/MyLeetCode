package com.huaxiti.LeetCode100;

import java.util.Arrays;

public class L75颜色分类 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
    public static int[] sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        for(int m = 0; m < nums.length-1; m++){
            if (nums[m] == 2 && m <= r) {
                int temp = nums[r];
                nums[r] = nums[m];
                nums[m] = temp;
                r--;
            }
            if (nums[m] == 0) {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
            }
        }
        return nums;
    }
}
