package test15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:第102题 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 即逐层地，从左到右访问所有节点
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size()>0)
        {
            //获取队列长度，队列长度等于这一层元素的个数
            int size=queue.size();
            //创建临时list保存每一层的元素
            ArrayList<Integer> list=new ArrayList<Integer>();
            //将队列中的元素加入list中  如果他们的左右节点不为空那么加入到队列中
            for (int i=0;i<size;i++)
            {
                TreeNode t=queue.remove();
                list.add(t.val);
                if (t.left!=null)
                    queue.add(t.left);
                if (t.right!=null)
                    queue.add(t.right);
            }
            //将list加入到res中
            res.add(list);
        }
        return res;
    }
}
