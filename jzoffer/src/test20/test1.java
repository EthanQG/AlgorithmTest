package test20;

import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:栈的压入 弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class test1 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0 || popA.length != pushA.length)
            return false;
        Stack<Integer> stack=new Stack<Integer>();
        for (int i=0,j=0;i<pushA.length;i++)
        {
            //顺序入栈
            stack.push(pushA[i]);
            //如果栈顶元素和出栈序列元素相同 那么栈顶出栈 继续判断下一个出栈序列元素和栈顶元素是否相同
            //如果最后栈空 那么说明全都出栈则正确 如果栈不空则说明不是
            while(!stack.empty()&&stack.peek()==popA[j])
            {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}
