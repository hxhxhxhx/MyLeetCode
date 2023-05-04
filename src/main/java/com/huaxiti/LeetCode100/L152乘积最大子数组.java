package com.huaxiti.LeetCode100;

public class L152乘积最大子数组 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int[] nums1 = {-2,0,1};
        System.out.println(maxProduct(nums1));
    }
    public static int maxProduct(int[] nums) {
        if (nums.length ==1){
            return nums[0];
        }
        int l = 0;
        int r = 1;
        int maxPro = 0;
        while (r <= nums.length-1){
            maxPro = Math.max(maxPro,nums[l]*nums[r]);
            maxPro = Math.max(maxPro,nums[l]);
            maxPro = Math.max(maxPro,nums[r]);
            l++;
            r++;
        }
        return maxPro;
    }
}
