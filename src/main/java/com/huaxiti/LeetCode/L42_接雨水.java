package com.huaxiti.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class L42_接雨水 {
    public static void main(String[] args) {
       int[] height = {4,2,3};
//       int[] height = {4,2,0,3,2,5};
//       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height){
        int i = 0;
        int j = 0;
        int result = 0;
        int Mid = 0;
        if (height.length==0){
            return 0;
        }
        if (height[0]==0){
            i++;
            j++;
        }
        while (i<height.length-1){


            j++;
            if (height[i] <= height[j]) {
                int z = i;
                while (z<j-1) {
                    z++;
                    Mid += height[z];
                }
                result += Math.min(height[i],height[j]) * (j - i-1) - Mid;
                i=j;
                Mid = 0;
            }

            if (height[i]>height[j] && j==height.length-1){
                i++;
                j=i;
            }



        }
        return result;
    }


    public static int trap1(int[] height){
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }

}
