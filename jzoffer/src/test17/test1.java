package test17;

/**
 * @Auther: wqg
 * @Description:二叉树的镜像
 *操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
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
    public void Mirror(TreeNode root) {
        if (root==null||(root.left==null&&root.right==null))
            return;
        //交换左右结点
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        //递归交换左结点的左右结点
        if (root.left!=null){
            Mirror(root.left);
        }
        //递归交换右结点的左右结点
       if (root.right!=null)
       {
           Mirror(root.right);
       }
    }
}
