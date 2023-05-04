package com.huaxiti.LeetCode;

public class L11_盛水最多的容器 {
    public static void main(String[] args) {
        int[] height = {1,1};
//        System.out.println(height);
//        System.out.println(height.length);
//        System.out.println(height[height.length-1]);
//        System.out.println(height[0]);
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height){
        int i = 0;
        int j = height.length-1;
        int count = 0;
        int result = 0;
        while (i<j){
            count = Math.min(height[i],height[j])*(j-i);
            result = Math.max(result,count);
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }

        return result;
    }
}
