package com.huaxiti.LeetCode100;

public class L64最小路径和 {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
    }

    public int minPathSum1(int[][] grid){
        int x = grid.length;
        int y = grid[0].length;

        int[][] dp = new int[x-1][y-1];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < x; i++){
            dp[i][0] = grid[i-1][0] + grid[i][0];
        }
        for(int j = 1; j < y; j++){
            dp[0][j] = grid[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                dp[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return dp[x-1][y-1];
    }

    public int minPathSum2(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;

        int[][] dp = new int[x][y];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < x; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int j = 1; j < y; j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[x-1][y-1];
    }
}
