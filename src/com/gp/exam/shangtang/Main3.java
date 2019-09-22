package com.gp.exam.shangtang;

import java.util.Scanner;

/**
 * @Author: pearl
 * @DATE: 2019/9/21 19:53
 * @Description:
 */
public class Main3 {
    public static void main(String[] args){
        Scanner  in = new Scanner(System.in);
        int salary = in.nextInt();
        int min = in.nextInt();
//        System.out.println(change(salary, salary-1));
        for(int i = salary; i>0; i--){
            int res = change(salary, i);
            if(res != -1 && res >= min) {
                System.out.println(i);
                return;
            }
        }
    }

    static int change(int number, int n){
        StringBuilder result = new StringBuilder();
        while(number>0){
            int tmp = number%n;
//            if(tmp>9) {
//                return -1;
//            }
            result.append(tmp);
            number /= n;
        }
        result.reverse();
        return Integer.parseInt(result.toString());
    }

}
