package com.tuya.leetcode.practice.maxlengthnode;

/**
 * 做了一些事，但是好像什么事情都没做
 *
 * @Date 2022/3/2 下午4:14
 * @Author by an ordinary handsome guy
 */
public class Solution {


    private  static int length=0;

    public static int maxLengthNode(TreeNode treeNode) {
        deep(treeNode);
        return length;
    }

    public static int deep(TreeNode treeNode){
        if (treeNode==null){
            return 0;
        }
        int left = deep(treeNode.left);
        int right = deep(treeNode.right);
        length = Math.max(length,left+right);
        return left+right+1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(33);
        TreeNode treeNode1 = new TreeNode(32);

        TreeNode treeNode3 = new TreeNode(30);
        TreeNode treeNode2 = new TreeNode(33,new TreeNode(5,treeNode,treeNode1),treeNode3);
        TreeNode treeNode5 = new TreeNode(31);
        TreeNode treeNode4 = new TreeNode(12,treeNode2,treeNode5);
        TreeNode treeNode6 = new TreeNode(25);
        TreeNode treeNode7 = new TreeNode(5,treeNode4,null);
        TreeNode treeNode8 = new TreeNode(6,treeNode7,treeNode6);

        System.out.println(deep(treeNode8));
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
