package com.huaxiti.interview.mihoyou;

import java.util.*;

/**
 * 米小游最近在研究 n皇后问题。 所谓 n皇后问题，指 n×n 的棋盘中，放置 n个皇后，满足两两之间不会互相攻击。每个皇后可以攻击同一行、同一列以及同一 45 度角斜线和 135 度角斜线上的所有其他皇后。米小游拿到了一个 n×n 的棋盘，目前已经放置了一些皇后，米小游希望再放置一个皇后， 满足所有的皇后不会互相攻击。你能帮米小游求出有多少种放置方案吗?
 *
 * 输入描述
 *
 * 第一行输入一个正整数 n，代表棋盘大小。
 *
 * 接下来的 n 行，每行输入一个仅由 .和 ∗ 组成的字符串，其中 ∗ 代表放置了一个皇后， . 代表未放置皇后。
 *
 * 保证输入的棋盘中没有两个皇后会互相攻击。
 *
 * 1≤n≤1000
 *
 * 输出描述
 *
 * 输出米小游有多少种放置方案。
 *
 * 样例
 *
 * **输入**
 *
 * ```
 * 3
 * .*.
 * ...
 * ...
 * ```
 *
 * **输出**
 *
 * 2
 */
public class demo2 {
    public static void main(String[] args) {

    }
    public static int KQueen(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ints = new int[n][n];
        while (scanner.hasNext()){
            int a = 0;
            String[] split = scanner.next().split("");
            for (int x = 0; x <= split.length - 1; x++){
                ints[a][x] = Integer.parseInt(split[x]);
            }
            a++;
        }
        HashSet<Integer> s = new HashSet<>();
        List l = new ArrayList<Integer>(s);
        return 0;
    }
}
