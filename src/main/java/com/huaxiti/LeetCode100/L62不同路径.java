package com.huaxiti.LeetCode100;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L62不同路径 {
    public static void main(String[] args) {

    }

    public int uniquePaths(int m, int n) {
        //一维空间，其大小为 n
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 1; i < m; ++i) {
            for(int j = 1; j < n; ++j) {
                //等式右边的 dp[j]是上一次计算后的，加上左边的dp[j-1]即为当前结果
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }



    //动态规划
    public int uniquePaths2(int m, int n){
        int [][] dp = new int[m][n];
        //第一行赋予1
        for (int i = 0; i < m; ++i){
            dp[i][0] = 1;
        }
        //第一列赋予1
        for (int j = 0; j < n; ++j){
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; ++i){
            for (int j = 1; j < n; ++j){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }


    //递归
    public int uniquePaths1(int m, int n){

        return dfs(new HashMap<Pair,Integer>(), 0, 0, m, n);
    }

    public int dfs(Map<Pair,Integer> cache, int i, int j, int m, int n){
        Pair p = new Pair(i,j);

        //缓存
        if (cache.containsKey(p)){
            return cache.get(p);
        }

        //边界
        if(i == m - 1 || j == n -1){
            return 1;
        }

        //继续递归
        cache.put(p,dfs(cache, i+1, j, m, n) + dfs(cache, i, j+1, m, n));
        return cache.get(p);
    }
}
