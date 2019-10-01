package com.gp.exam.byteDance;

import java.util.Scanner;

/**
 * @Author: pearl
 * @DATE: 2019/9/29 21:23
 * @Description:   同main
 */
public class Main1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String input = in.nextLine();
            String[] nums = input.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int c = Integer.parseInt(nums[2]);

            if((a+b)>c && (b+c) > a && (a+c)>b){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
