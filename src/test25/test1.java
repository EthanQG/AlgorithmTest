package test25;

import java.util.Arrays;

/**
 * @Auther: wqg
 * @Description:第105题 从前序和中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * 注意:
 * 你可以假设树中没有重复的元素。
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
            //前序遍历的第一个是根节点
            TreeNode root = new TreeNode(preorder[0]);
            for (int i = 0; i < preorder.length; i++) {
                if (inorder[i] == preorder[0]) {
                    //在中序遍历中找到根节点后对前序和中序遍历进行划分，划分为左右两部分 然后进行递归遍历继续划分
                    int[] pre_left = Arrays.copyOfRange(preorder, 1, i + 1);
                    int[] pre_right = Arrays.copyOfRange(preorder, i + 1, preorder.length);
                    int[] inorder_left = Arrays.copyOfRange(inorder, 0, i);
                    int[] inorder_right = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                    //划分好后连接
                    root.left = buildTree(pre_left, inorder_left);
                    root.right = buildTree(pre_right, inorder_right);
                    break;
                }
            }
            return root;
        }

    }
