package com.huaxiti.LeetCode100;

public class L33搜索旋转排序数组 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(serach(nums, target));
    }

    public static int serach(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int serach1(int[] nums, int target){
        int start = 0;
        int end = 1;
        int result = 0;
        if (nums.length ==0){
            return -1;
        }
        if (nums.length == 1){
            if (nums[0] ==target){
                return 0;
            }
            return -1;
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[start] == target){
                result += start;
            }
            if (nums[end] == target){
                result += end;
            }
            if (nums[end] > nums[start] && end < nums.length-1){
                start++;
                end++;
            }
            if (nums[end] < nums[start] && end < nums.length-1){
                result += (nums.length-start);
                end++;
            }
        }
        return result;
    }


}
