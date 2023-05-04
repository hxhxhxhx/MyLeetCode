package com.huaxiti.interview.mihoyou;

import java.util.Scanner;

/**
 * 米小游准备做一些甜甜花酿鸡。
 *
 * 已知做一个甜甜花酿鸡，需要 2 个甜甜花和 2 个禽肉。米小游现在有 a 个甜甜花， b 个禽肉，以及 c*c* 个万能食材(每个万能食材可以当作一个甜甜花或者一个禽肉)
 *
 * 米小游想知道，自己最多可以做多少只甜甜花酿鸡?
 *
 * 输入描述
 *
 * 输入三个整数 a,b,c*a*,*b*,*c* ， 用空格隔开。 0≤a,b,c≤1090≤*a*,*b*,*c*≤109
 *
 * 输出描述
 *
 * 一个整数，代表可以制作的甜甜花酿鸡的最大数量。
 *
 * 样例
 *
 * **输入**
 *
 * ```none
 * 3 3 3
 * ```
 *
 * **输出**
 *
 * ```none
 * 2
 * ```
 *
 * **样例解释**
 *
 * 可以将两个万能食材当作一个甜甜花和一个禽肉，所以是 `4 4 1` 可以制作两个甜甜花酿鸡。
 */
public class demo1 {
    public static void main(String[] args) {
        System.out.println(resultNum());
    }

    public static int resultNum(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        if (a == 0 || b == 0){
            if (c == 0){
                return 0;
            }
            return c/2;
        }
//        if (a > b && c != 0){
//
//            if (a >= b+c){
//                return (b+c)/2;
//            }else if (a < b+c){
//                return (a+(c-a+b)/2)/2;
//            }
//        }else if (a > b && c == 0){
//            return b/2;
//        }
        if (c != 0){
            int min = Math.min(a, b);
            int max = Math.max(a,b);
            if (max >= min+c){
                return (min+c)/2;
            }else if (max < min+c){
                return (max+(c-max+min)/2)/2;
            }
        }else {
            return Math.min(a,b)/2;
        }
        return 0;
    }
}
