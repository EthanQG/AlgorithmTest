package test14;

/**
 * @Auther: wqg
 * @Description:第101题对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的
 */
public class test1 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x)  { val = x; }
  }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode left,TreeNode right) {
        //终止条件：左右不相等 两个节点都为空或其中一个节点为空
        if (left==null&&right==null)
            return true;

        if (left==null||right==null)
            return false;
        if (left.val!=right.val)
            return false;
        //递归比较左节点的左孩子和右节点的右孩子  左节点的右孩子和右节点的左孩子
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }

}
