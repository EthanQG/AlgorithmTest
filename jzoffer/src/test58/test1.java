package test58;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Auther: wqg
 * @Description:按之字形顺序打印二叉树
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
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
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> queue=new LinkedList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        queue.add(pRoot);
        int level=1;
        while (!queue.isEmpty())
        {
            int size=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                if (node==null) continue;;
                if (level%2==1)
                    list.add(node.val);
                else
                    list.add(0,node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            }
            if (list.size()!=0) res.add(list);
            level++;
        }
        return res;
    }

}
