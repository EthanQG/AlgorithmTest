package test12;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:第94题 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序 遍历。
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 输出: [1,3,2]
 */
public class test1 {
    //解法1递归实现
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        dfs(res,root);
        return res;
    }
    void dfs(List<Integer> res,TreeNode root)
    {
        if (root==null) return;
        //左中右
        dfs(res,root.left);
        res.add(root.val);
        dfs(res,root.right);
    }
}
