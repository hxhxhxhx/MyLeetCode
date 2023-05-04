package com.huaxiti.LeetCode100;

import java.util.*;

public class L {
    public static void main(String[] args) {
        int[] nums = {3,1,5,4,9,8};
        int[] n = {};

        //冒泡排序
        System.out.println(Arrays.toString(maopaoSort(nums)));
        //选择排序
//        System.out.println(Arrays.toString(selectSort(nums)));
        //插入排序
//        System.out.println(Arrays.toString(insertSort(nums)));
        //快速排序
//        fastSort();
        //堆排序
        //希尔排序
    }

    public static int[] maopaoSort(int[] nums){
        if (nums == null || nums.length <2){
            return nums;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] selectSort(int[] nums){
        if (nums == null || nums.length < 2){
            return nums;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int small = i;
            for (int j = i ; j < n; j++){
                if (nums[j] < nums[small]){
                    small = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[small];
            nums[small] = temp;
        }

        return nums;
    }

    public static int[] insertSort(int[] nums){
        if (nums == null || nums.length < 2){
            return nums;
        }
        int n = nums.length;
        for (int i = 1; i < n; i++){
            int min = nums[i];
            int j = i - 1;
            while (nums[j--] > min && j > 0){
                nums[j+1] = nums[j];
                min = j;
            }

        }
        return nums;
    }
}
