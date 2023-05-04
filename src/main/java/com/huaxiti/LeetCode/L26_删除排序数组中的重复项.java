package com.huaxiti.LeetCode;

public class L26_删除排序数组中的重复项 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4};
        System.out.println(test(nums));
    }

    public static int test(int[] nums){
        int q = 1;
        int p = 0;
        if (nums == null || nums.length == 0){
            return 0;
        }
            while (q < nums.length){
                if (nums[p] != nums[q]){
                    nums[p+1] = nums[q];
                    p++;
                }
                q++;
            }

        return p + 1;
    }

}
