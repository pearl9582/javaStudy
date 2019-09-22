package com.gp.exam.shangtang;

import java.util.Scanner;

/**
 * @Author: pearl
 * @DATE: 2019/9/21 18:57
 * @Description:  从n*m的网格的左上角走到右下角，有多少种方法
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(count(n,m));
    }

    //问题一
    static int count(int x, int y){
        if(x == 1 || y == 1) {
            return 1;
        } else{
            return count(x-1,y)+count(x,y-1);
        }
    }
    static int count2(int n, int m ){
        int[][] dp = new int[n][m];
        for(int i = 0;i<n;i++){
            dp[0][i] = 1;
        }
        for(int i = 0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i = 1 ; i<n;i++){
            for(int j = 1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}
