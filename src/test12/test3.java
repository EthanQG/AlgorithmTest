package test12;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:莫里斯遍历
 * 用递归和迭代的方式都使用了辅助的空间，而莫里斯遍历的优点是没有使用任何辅助空间。
 * 缺点是改变了整个树的结构，强行把一棵二叉树改成一段链表结构。
 */
public class test3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        TreeNode pre=null;
        while(root!=null)
        {
            //如果左结点不为空 就把当前结点连同右节点全部挂在左节点的最右子树上
            if (root.left!=null)
            {
                pre=root.left;
                while(pre.right!=null)
                {
                    pre=pre.right;
                }
                pre.right=root;
                TreeNode tmp=root;
                root=root.left;
                tmp.left=null;
            }
            //左子树为空 打印右结点 向右遍历
            else {
                res.add(root.val);
                root=root.right;
            }
        }


        return res;
    }
}
