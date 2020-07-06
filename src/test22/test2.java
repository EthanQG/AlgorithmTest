package test22;

/**
 * @Auther: wqg
 * @Description:
 */
public class test2 {
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
    /*首先将根节点的左子树变成链表
    其次将根节点的右子树变成链表
    最后将变成链表的右子树放在变成链表的左子树的最右边
    */
        public void flatten(TreeNode root) {
            if(root == null){
                return ;
            }
            //将根节点的左子树变成链表
            flatten(root.left);
            //将根节点的右子树变成链表
            flatten(root.right);
            TreeNode temp = root.right;
            //把树的右边换成左边的链表
            root.right = root.left;
            //记得要将左边置空
            root.left = null;
            //找到树的最右边的节点
            while(root.right != null) root = root.right;
            //把右边的链表接到刚才树的最右边的节点
            root.right = temp;
        }


}
