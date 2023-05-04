package com.huaxiti.LeetCode;

public class L35_搜索插入位置 {
    public static void main(String[] args) {
        int[] nums= {1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (int n : nums){
            if(target<n){
                return i;
            }
            if (n==target){
                return i;
            }
            i++;
        }

        return i;
    }

}
