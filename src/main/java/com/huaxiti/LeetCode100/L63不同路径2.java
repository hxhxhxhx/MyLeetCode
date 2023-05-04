package com.huaxiti.LeetCode100;

class L63不同路径2 {
    public static void main(String[] args) {
        int[][] ints = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(ints));
        System.out.println(solution2(ints));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[] f = new int[m];

        f[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    f[j] = 0;
                    continue;
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    f[j] += f[j - 1];
                }
            }
        }
        return f[m - 1];
    }

    public static int solution2(int[][] ints){
        if (ints == null || ints.length == 0) return 0;
        int x = ints.length;
        int y = ints[0].length;
        int[][] dp = new int[x][y];
        for (int i = 0; i < x && ints[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < y && ints[0][i] == 0; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                if (ints[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[x-1][y-1];
    }
}