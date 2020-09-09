package test57;

import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:对称二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class test1 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null) return true;
        return dfs(pRoot.left,pRoot.right);
    }
    public boolean dfs(TreeNode left, TreeNode right)
    {
        if (left==null&&right==null) return true;
        if (left==null||right==null) return false;
        if (left.val!=right.val) return false;
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
