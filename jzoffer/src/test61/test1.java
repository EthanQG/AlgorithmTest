package test61;

import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:二叉搜索树的第k个结点
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）
 * 中，按结点数值大小顺序第三小结点的值为4
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
    TreeNode node=null;
    int index=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        help(pRoot,k);
        return node;
    }

    private void help(TreeNode pRoot, int k) {
        if (pRoot==null) return ;
        help(pRoot.left,k);
        index++;
        if (index==k)
        {
            node=pRoot;
            return;
        }
        else help(pRoot.right,k);
    }
}
