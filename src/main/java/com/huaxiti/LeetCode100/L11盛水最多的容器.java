package com.huaxiti.LeetCode100;

/**
 * 双指针
 */
public class L11盛水最多的容器 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(MaxH20(height));
    }

    public static int MaxH20(int[] height){
        int L = 0;
        int R = height.length-1;
        int ans = 0;
        int result = 0;
        while (L<R){
            ans = Math.min(height[L],height[R])*(R-L);
            result = Math.max(ans,result);
            if (height[L]<height[R]) {
                L++;
            }else {
                R--;
            }
        }
        return result;
    }
}
