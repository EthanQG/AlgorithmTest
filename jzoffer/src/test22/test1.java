package test22;

import java.util.Arrays;

/**
 * @Auther: wqg
 * @Description:二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class test1 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null||sequence.length<=0)
            return false;
        int root=sequence[sequence.length-1];
        int i=0;
        //二叉搜索树中左结点的值小于根节点
        for (;i<sequence.length-1;i++)
        {
            if (sequence[i]>root)
                break;
        }
        int j;
        //二叉搜索树中右节点的值大于根节点
        for (j=i;j<sequence.length-1;j++)
        {
            if (sequence[j]<root)
                return false;
        }
        //判断左子树是不是后序遍历
        boolean left=true;
        if(i>0) left=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        //判断右子树是不是后序遍历
        boolean right=true;
        if(i<sequence.length-1) right=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,sequence.length-1));
        return (left&&right);
    }
    public static void main(String []args)
    {
        int [] a={7,4,6,5};
        System.out.println(VerifySquenceOfBST(a));
    }
}
