package com.huaxiti.LeetCode100;

public class L55跳跃游戏 {
    public boolean canJump(int[] nums) {
        int start = 0;
        int end = nums.length;
        for(int i = start; i < end; i ++){
            start += nums[i];
            if (start>end){
                start--;
            }
        }
        return true;
    }
}
