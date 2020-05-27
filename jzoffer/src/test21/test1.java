package test21;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: wqg
 * @Description:从上向下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //用来存放节点值
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        //队列用来存放进入的每个结点
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        //将根节点放入队列
        queue.offer(root);//offer()队列尾部插入元素
        while(!queue.isEmpty())
        {
            //poll()访问队首元素并移除
            TreeNode temp = queue.poll();
            result.add(temp.val);
            if(temp.left != null)queue.offer(temp.left);
            if(temp.right != null)queue.offer(temp.right);
        }
        return result;
    }
}
