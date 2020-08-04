package test38;

/**
 * @Auther: wqg
 * @Description:平衡二叉树
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * 平衡二叉树的左右子树也是平衡二叉树，那么所谓平衡就是左右子树的高度差不超过1.
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
    public int depth(TreeNode root){
        if (root==null) return 0;
        int left=depth(root.left);
        if (left==-1) return -1;//左子树不是平衡二叉树就不用继续判断
        int right=depth(root.right);
        if (right==-1) return -1;
        if (left-right<(-1)||left-right>1) return -1;
        return 1+(left>right?left:right);

    }
    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root)!=-1;
    }
}
