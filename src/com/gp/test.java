package com.gp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: pearl
 * @DATE: 2019/9/21 15:33
 * @Description:
 */
public class test {
    public static List<Integer>  getListByRemove(List<Integer> list){
        for(int i = 0;i < list.size();i++){
            Integer number = list.get(i);
            if(number%2 == 0){
                list.remove(i);
                i --;
            }
        }
        return list;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int[] nums = new int[]{1,2,3,4};
        for(int n:nums){
            if(n%2!=0){
                list.add(n);
            }
        }
//        list.forEach(System.out::println);
        list.add(4);
        getListByRemove(list);
        list.forEach(System.out::println);
    }
}
