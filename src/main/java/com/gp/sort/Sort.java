package com.gp.sort;

public class Sort {
    static void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    private static void printNums(int[] nums){
        for(int num : nums ){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    //插入排序
    static void insertSort(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > cur){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = cur;
        }
    }

    //希尔排序
    static void shellSort(int[] nums){

    }


    public static void main(String[] args){
        int[] nums = new int[]{3, 1, 7, 4, 9, 5, 0, 8, 2, 6};
        insertSort(nums);
        printNums(nums);
    }
}
