package com.oj;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: pearl
 * @DATE: 2020/7/26 10:30
 * @Description:
 */

/***
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）
 * 形成树的一条路径，最长路径的长度为树的深度。
 *
 * 可以采用层次遍历的方法，层次遍历可采用队列或者递归
 *
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class TreeDepth {
    /**
     * 1. 队列。 使用Queue存储每一层的节点，count记录上一层的子节点数量
     *
     * @param root
     * @return
     */
    public int QueueTreeDepth(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.add(root);
        int numQueue = 1;
        int count = 0;
        while (!nodeQueue.isEmpty()) {
            TreeNode now = nodeQueue.poll();
            count ++;
            if(now.left != null){
                nodeQueue.add(now.left);
            }
            if(now.right != null){
                nodeQueue.add(now.right);
            }
            if(count == numQueue){
                numQueue = nodeQueue.size();
                count = 0;
                result ++;
            }
        }
        return result;
    }

    /***
     * 2 递归
     * @param root
     * @return
     */
    public int RecursionTreeDepth(TreeNode root){
        int result = 0;
        if(null == root){
            return result;
        }
        return Math.max(RecursionTreeDepth(root.left), RecursionTreeDepth(root.right))+1;
    }
}
