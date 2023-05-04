package com.huaxiti.LeetCode100;

public class L45跳跃游戏2 {
    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        System.out.println(jump(nums));
    }

    static int resultNum = 100;
    public static int jump(int[] nums) {
        return jumpN(nums,0);
    }
    public static int jumpN(int[] nums, int n){
        if (n >= nums.length -1) return 0;
        for (int i = 1; i <= nums[n]; i++){
            resultNum = Math.min(resultNum,jumpN(nums,n+i)+1);
        }
        return resultNum;
    }
}
