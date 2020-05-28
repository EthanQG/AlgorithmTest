package test23;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:二叉树中和为某一值的路径
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
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
    ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root==null) return result;
        list.add(root.val);
        target-=root.val;
        //target减为0并且左右节点为空说明到达叶结点并且和为0 返回结果即可
        if (target==0&&root.left==null&&root.right==null)
            result.add(new ArrayList<>(list));
        //遍历左右节点继续递归判断
        FindPath(root.left,target);
        FindPath(root.right,target);
        //遍历完左右节点后说明这条路径已经走完 已经遍历完这个结点的左右子树 所以返回上一层的时候需要删除这个结点
        list.remove(list.size()-1);
        return result;
    }
}
