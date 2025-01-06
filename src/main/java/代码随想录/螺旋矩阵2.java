package 代码随想录;

import java.util.Arrays;

public class 螺旋矩阵2 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(method(4)));
    }

    private static int[][] method(int n){
        int i;
        int j;
        int x = 0;
        int y = 0;
        int offset = 1;
        int count = 1;
        int loop = 1;
        int[][] result = new int[n][n];
        while (loop <= n/2){
            //顶部
            for (j = x; j < n - offset; j++){
                result[x][j] = count++;
            }
            //右边
            for (i = y; i < n - offset; i++){
                result[i][j] = count++;
            }
            //底部
            for (;j > y; j--){
                result[i][j] = count++;
            }
            //左边
            for (;i > x; i--){
                result[i][j] = count++;
            }
            x++;
            y++;
            offset++;
            loop++;
        }
        if (n%2 == 1){
            result[x][y] = count;
        }
        return result;
    }

}
