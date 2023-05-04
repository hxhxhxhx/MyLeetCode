package com.huaxiti.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.FutureTask;

public class ListAll {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

    }

    public List<int[]> digui(int[] nums){
        List<int[]> list = new ArrayList<int[]>();
        int length = nums.length;
        backtrack(list, 0,length,new int[length],nums);
        return list;
    }

    private void backtrack(List<int[]> list, int i, int length, int[] nums, int[] res) {
        if (i > length){
            list.add(res);
            return;
        }
        if (i != length){
            res[i] = nums[i];
            backtrack(list,i+1,length,nums,res);

        }
    }

}
