package com.gp.exam.mafengwo;

/**
 * @Author: pearl
 * @DATE: 2019/9/24 10:17
 * @Description: 马蜂窝第二题，给出满二叉树先序遍历？感觉是层序遍历？ 画出二叉树结构（没给样例）/ 给出某一个数字的中序遍历下一个节点
 */

import java.util.*;
public class Main1 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int target = in.nextInt();
        String[] nums = line.split(",");
        draw(nums);
//		if((target*2+1)<nums.length+1) {
//			System.out.println(nums[target*2]);
//		}else {
//			int next = target/2;
//			System.out.println(next-1);
//		}



//		for(int i = 0;i<nums.length;i++) {
//			TreeNode now = new TreeNode(Integer.valueOf(nums[i]));
//			if()
//		}
    }
    static void draw(String[] nums){
        int i = 0;
        int level = 1;
        while (i< nums.length) {
            System.out.print(nums[i]);
            System.out.print(" ");
            if((i+1)==Math.pow(2, level)-1) {
                System.out.println();
                level ++;
            }
            i++;
        }

    }

}

