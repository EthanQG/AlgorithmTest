package test37;

/**
 * @Auther: wqg
 * @Description:二叉树的深度
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
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

    public int TreeDepth(TreeNode root) {
        if (root==null) return 0;
        int left=TreeDepth(root.left);
        int right= TreeDepth(root.right);
        int res=1+Math.max(left,right);
        return res;
    }


}
