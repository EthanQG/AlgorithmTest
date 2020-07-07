package test23;

/**
 * @Auther: wqg
 * @Description:第543题 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * 两结点之间的路径长度是以它们之间边的数目表示。
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
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        depth(root);
        return ans-1;
    }
    public int depth(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=depth(root.left);//计算左子树的深度
        int right=depth(root.right);//计算右子树的深度
        ans=Math.max(ans,left+right+1);//保存最大的深度
        //返回这棵树的深度
        return Math.max(left,right)+1;
    }
}
