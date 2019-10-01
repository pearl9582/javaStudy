package com.gp.exam.byteDance;

import java.util.Scanner;

/**
 * @Author: pearl
 * @DATE: 2019/9/29 20:25
 * @Description:  逆循环打印矩阵
 */
public class Main3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String input = in.nextLine().trim();
            if(!input.equals("")){
                String[] nums = input.split(" ");
                int row = Integer.parseInt(nums[0]);
                int col = Integer.parseInt(nums[1]);
                printMatrix(row,col);
            }else {
                break;
            }
        }
    }
    static void printMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        int t = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                t++;
                matrix[i][j] = t;
            }
        }

        int top = 0, bottom = row - 1, left = 0, right = col - 1;
        StringBuilder sb = new StringBuilder();
        while (top <= bottom && left <= right) {
            for (int i = right; i >=left; i--) {
                sb.append(matrix[top][i]);
                sb.append(" ");
            }
            for (int i = top + 1 ; i<=bottom;i++) {
                sb.append(matrix[i][left]);
                sb.append(" ");
            }
            if(bottom>top){
                for (int i = left+1; i<right; i++) {
                    sb.append(matrix[bottom][i]);
                    sb.append(" ");
                }
            }
            if(left<right){
                for (int i = bottom; i > top; i--) {
                    sb.append(matrix[i][right]);
                    sb.append(" ");
                }
            }
            right--;
            left++;
            top++;
            bottom--;
        }
        System.out.println(sb.toString().trim());
    }
}
