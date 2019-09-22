package com.gp.exam.shangtang;

import java.util.Scanner;

/**
 * @Author: pearl
 * @DATE: 2019/9/21 19:40
 * @Description:  输入一个循环队列，找到最大连续子数组的和
 */
public class Main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len];
        for(int i = 0; i<len;i++){
            nums[i] = in.nextInt();
        }
        System.out.println(findMaxSum(nums));
    }
    static int findMaxSum(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int s = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length;i++){
            if(s <=0) {
                s = nums[i];
            }else {
                s += nums[i];
            }
            if(s > max) {
                max = s;
            }
        }
        return max;
    }
}
