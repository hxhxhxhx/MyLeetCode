package com.huaxiti.LeetCode;

import java.util.Arrays;

public class L27_移除元素 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
    public static int removeElement(int[] nums,int val){
        int p = 0;
        int q = nums.length;
        while (p < q){
            if (nums[p] == val){
                nums[p] = nums[q-1];
                q--;
            }else {
                p++;
            }
        }
        return q;
    }
}
