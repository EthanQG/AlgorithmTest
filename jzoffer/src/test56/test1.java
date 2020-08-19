package test56;

/**
 * @Auther: wqg
 * @Description:二叉树的下一个结点
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class test1 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null) return null;
        //存在右子树，该节点的下一个结点是它的右子树的最左节点
        if(pNode.right!=null)
        {
            pNode=pNode.right;
            while(pNode.left!=null)
            {
                pNode=pNode.left;
            }
            return pNode;
        }
        //不存在右子树,中序遍历的下一个结点必定为该节点的父辈节点
        while(pNode.next!=null)
        {
            if(pNode.next.left==pNode)
            {
                return pNode.next;
            }
            pNode=pNode.next;
        }
        return null;
    }
}
