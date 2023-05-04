package com.huaxiti.LeetCode100;

public class L1两数之和 {
    public static void main(String[] args) {
        int[] nums ={3,2,4};
        int target = 6;
        SumTwoNum(nums,target);
    }

    private static void SumTwoNum(int[] nums, int target) {
        int[] result = new int[2];
        int end = nums.length;
        for (int i = 0; i < end; i++) {
            for (int j = end-1; j >= 0; j--) {
                if (nums[i]+nums[j]==target){
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        System.out.println(result);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
