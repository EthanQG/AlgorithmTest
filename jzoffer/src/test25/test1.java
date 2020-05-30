package test25;

import java.util.ArrayList;

/**
 * @Auther: wqg
 * @Description:二叉搜索树与双向链表
 *输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
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
    //思路：中序遍历的结果刚好是左根右满足二叉搜索树的特性，所以进行中序遍历把结点存储起来然后遍历链表改变指向
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        ArrayList<TreeNode> list=new ArrayList<>();
        Convert(pRootOfTree,list);
        return Convert(list);
    }
    //中序遍历
    public void Convert(TreeNode pRootOfTree, ArrayList<TreeNode> list) {
        if (pRootOfTree.left!=null)
            Convert(pRootOfTree.left,list);
        list.add(pRootOfTree);
        if(pRootOfTree.right != null)
            Convert(pRootOfTree.right, list);
    }
    //设置指向
    public TreeNode Convert(ArrayList<TreeNode> list)
    {
        TreeNode head=list.get(0);
        TreeNode cur=head;
        for (int i=1;i<list.size();i++)
        {
            TreeNode node=list.get(i);
            node.left=cur;
            cur.right=node;
            cur=node;
        }
        return head;
    }
}
