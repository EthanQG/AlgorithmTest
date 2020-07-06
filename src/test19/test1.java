package test19;

/**
 * @Auther: wqg
 * @Description:第236题 二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
 * 最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 */
public class test1 {
    public class TreeNode  {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果pq为root那么直接返回root
        if (root==null||root==p||root==q)
            return  root;
        //后序遍历
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        //左右返回都是null说明树种没有pq
        if (left==null&&right==null)
            return null;
        //左边返回节点右边为null 说明都在左子树
        if (right==null) return left;
        //右边返回节点左边为null 说明都在右子树
        if (left==null) return right;
        //左右都不为空 说明root为最近公共祖先
        return root;
    }
}
