package test22;

/**
 * @Auther: wqg
 * @Description:第114题 把二叉树展开成链表
 * 给定一个二叉树，原地将它展开为一个单链表。
 */
public class test1 {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
  }
  /*
  将左子树插入到右子树的地方
  将原来的右子树接到左子树的最右边节点
  考虑新的右子树的根节点，一直重复上边的过程，直到新的右子树为 null*/
    public void flatten(TreeNode root) {
        while(root!=null)
        {
            //左子树为空时直接下一个节点
            if (root.left==null)
            {
                root=root.right;
            }
            else {
                //找到左子树的最右节点
                TreeNode pre=root.left;
                while(pre.right!=null)
                {
                    pre=pre.right;
                }
                //把root的右子树挂在左子树的最右节点上
                pre.right=root.right;
                //把左子树挂在右子树上
                root.right=root.left;
                //把左子树置空
                root.left=null;
                //指向下一个节点
                root=root.right;
            }
        }
    }
}
