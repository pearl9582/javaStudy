package com.gp.exam.byteDance;

import java.util.Scanner;

/**
 * @Author: pearl
 * @DATE: 2019/9/29 21:16
 * @Description:
 */
public class Main4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        for(int i  = 2;i<n;i++){
            if(isZhiShu(i)){
                res ++;
            }
        }

    }
    static boolean isZhiShu(int n){
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
