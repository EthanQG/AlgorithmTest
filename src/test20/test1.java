package test20;

/**
 * @Auther: wqg
 * @Description:第226题 翻转二叉树
 * 翻转一棵二叉树。
 * 输入：
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class test1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return null;
        root.left=invertTree(root.left);
        root.right=invertTree(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }
}
