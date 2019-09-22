package com.gp.dp;

/**
 * @Author Pearl
 * @Description:
 * @Date 2019/9/22上午 10:06
 */

import java.util.Scanner;

public class MoneyN {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        func2();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    private static void func2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = {5, 10, 25};
        int numsC = coins.length;
        int[][] ways = new int[numsC][n + 1];
        for (int i = 0; i < numsC; i++)
            ways[i][0] = 1; //第0行初始化为1
        for (int j = 1; j <= n; j++)
            ways[0][j] = 1; //第0列初始化为1
        for (int i = 1; i < numsC; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= coins[i])
                    ways[i][j] = ways[i - 1][j] + ways[i][j - coins[i]];
                else
                    ways[i][j] = ways[i - 1][j];
            }
        }
        System.out.println(ways[numsC - 1][n] %1000000007);
    }
}

