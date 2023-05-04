package com.huaxiti.LeetCode100;

import java.util.HashMap;
import java.util.HashSet;

public class L128最长连续序列 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,3,1,2};
        int i = longestConsecutive(nums);
        System.out.println(i);
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums){
            hashSet.add(num);
        }

        int longes = 0;
        for (int num : hashSet){
            if (!hashSet.contains(num-1)){
                int currentStreak = 1;
                while (hashSet.contains(num+=1)){
                    currentStreak += 1;
                }
                longes = Math.max(longes,currentStreak);
                if (longes>=nums.length/2+1){
                    break;
                }
            }
        }

        return longes;
    }
}
