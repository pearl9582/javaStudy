package com.gp.exam.byteDance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: pearl
 * @DATE: 2019/9/29 19:50
 * @Description:  三个int64， abc，判断 a-b>c是否正确
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()){
            String str = in.nextLine();
            if(str.equals("")) {
                break;
            }
            String[] nums = str.split(" ");
            long a = Long.parseLong(nums[0]);
            long b = Long.parseLong(nums[1]);
            long c = Long.parseLong(nums[2]);

            String res = "true";
            if((c-b)<a){
                res = "true";
            }else {
                res = "false";
            }
            System.out.println(res);
        }

    }
}
