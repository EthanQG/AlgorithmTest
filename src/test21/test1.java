package test21;

/**
 * @Auther: wqg
 * @Description:第337题 打家劫舍
 * 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。
 * 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，
 * 聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
 * 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 * 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
 * 输入: [3,2,3,null,3,null,1]
 *
 *      3
 *     / \
 *    2   3
 *     \   \
 *      3   1
 * 输出: 7
 * 解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.输入: [3,4,5,1,3,null,1]
 *
 *      3
 *     / \
 *    4   5
 *   / \   \
 *  1   3   1
 * 输出: 9
 * 解释: 小偷一晚能够盗取的最高金额 = 4 + 5 = 9.
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
    /*方法一 递归法
    根据题目要求可以总结出两种偷钱方式
    1个爷+4个孙子 VS 2个儿子
    1一个爷+4个孙子：
    int method1 = root.val + rob(root.left.left) + rob(root.left.right) + rob(root.right.left) + rob(root.right.right)
    两个儿子偷的钱如下
    int method2 = rob(root.left) + rob(root.right);

    int result = Math.max(method1, method2);
    * */
    public int rob(TreeNode root) {
        if (root==null)
            return 0;
        int money=root.val;
        if (root.left!=null)
            money+=(rob(root.left.left) + rob(root.left.right));
        if (root.right!=null)
            money+=(rob(root.right.left) + rob(root.right.right));
        return Math.max(money,rob(root.left)+rob(root.right));
    }
}
