package test12;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:用栈来实现
 */
public class test2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(stack.size()>0 || root!=null)
        {
            //把当前值放入栈中 一直向左走 走到头打印出栈 然后向右走
            if (root!=null)
            {
                stack.add(root);
                root=root.left;
            }else
                //root为空说明左边走到头 出栈然后走右结点
            {
                TreeNode temp=stack.pop();
                res.add(temp.val);
                root=temp.right;
            }
        }
        return res;
    }
}
