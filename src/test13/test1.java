package test13;

import java.util.List;

/**
 * @Auther: wqg
 * @Description:第98题 验证二叉搜索树
    给定一个二叉树，判断其是否是一个有效的二叉搜索树。
    假设一个二叉搜索树具有如下特征：
    节点的左子树只包含小于当前节点的数。
    节点的右子树只包含大于当前节点的数。
    所有左子树和右子树自身必须也是二叉搜索树。
 */
public class test1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        //对左节点遍历
        if (!isValidBST(root.left))
        {
            return false;
        }
        //当前根节点小于前一个结点说明不符合二叉搜索树
        if (root.val<=pre)
        {
            return false;
        }
        //将该结点的值保存为pre去判断右节点
        pre=root.val;
        //对右节点遍历 返回的结果就是右节点执行后的结果 因为可以执行右节点必定前面正确
        return isValidBST(root.right);
    }
}
