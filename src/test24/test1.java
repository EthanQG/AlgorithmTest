package test24;

/**
 * @Auther: wqg
 * @Description:第538题 把二叉搜索树转换为累加树
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * 输入: 原始二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
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
    int sum=0;
    //就是反向的中序遍历 因为右节点大 所以把右节点依次遍历累加到他的上一个节点中
    public TreeNode convertBST(TreeNode root) {
        if (root!=null){
            //一直遍历右节点
            convertBST(root.right);
            //把当前节点累加
            sum+=root.val;
            //把累加的结果赋给当前的节点值 因为累加的永远是比他大的节点 所以加完之后赋值即可
            root.val=sum;
            //再对左节点进行累加赋值
            convertBST(root.left);
        }
        return root;
    }
}
