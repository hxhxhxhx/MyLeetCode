package com.huaxiti.LeetCode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 算法流程：
 * 1、特判，对于数组长度 n，如果数组为 null 或者数组长度小于 3，返回 []。
 * 2、对数组进行排序。
 * 3、遍历排序后数组：
 *      若 nums[i]>0：因为已经排序好，所以后面不可能有三个数加和等于 0，直接返回结果。
 *      对于重复元素：跳过，避免出现重复解
 *      令左指针 L=i+1，右指针 R=n−1，当 L<R 时，执行循环：
 *      当 nums[i]+nums[L]+nums[R]==0，执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,R 移到下一位置，寻找新的解
 *      若和大于 0，说明 nums[R] 太大，R 左移
 *      若和小于 0，说明 nums[L] 太小，L 右移
 *
 */
public class L15三数之和 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(SumThreeNums(nums));
    }

    public static List<List<Integer>> SumThreeNums(int[] nums){
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        int length = nums.length;
        if (length<3 || length==0){
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i]>0) return lists;
            if (i>0 && nums[i]==nums[i-1]) continue;

            int L = i + 1;
            int R = length-1;
            while (L<R){
                List<Integer> list = new ArrayList<Integer>();
                if (nums[i]+nums[L]+nums[R]==0){
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while (L<R && nums[L]==nums[L+1]) L++;
                    while (L<R && nums[R]==nums[R-1]) R--;
                    L++;
                    R--;
                }else if (nums[i]+nums[L]+nums[R]>0){
                    R--;
                }else {
                    L++;
                }
            }
        }
        return lists;
    }
}
