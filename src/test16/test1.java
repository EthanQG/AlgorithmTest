package test16;

/**
 * @Auther: wqg
 * @Description:第437题 路径总和
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 * 找出路径和等于给定数值的路径总数
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
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
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
            return 0;
        //判断当前节点开始满足的条件的路径数量
        int a=countPath(root,sum);
        //判断当前节点的左节点开始满足的条件的路径数量
        int b=pathSum(root.left,sum);
        //判断当前节点的右节点开始满足的条件的路径数量
        int c=pathSum(root.right,sum);
        return a+b+c;
    }
    public int countPath(TreeNode root,int sum)
    {
        if(root==null)
            return 0;
        sum=sum-root.val;
        //sum如果为零那么说明这是一条路径 +1
        int result=sum==0?1:0;
        //继续判断该节点的左右子树
        return result+countPath(root.left,sum)+countPath(root.right,sum);
    }
}
