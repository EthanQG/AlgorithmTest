package test19;

import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 */
public class test1 {
    Stack<Integer> stack1=new Stack<Integer>();//数据栈
    Stack<Integer> stack2=new Stack<Integer>();//辅助栈
    public void push(int node) {
        stack1.push(node);
        //辅助栈为空，那么当前值就是最小值直接添加
        if (stack2.empty()){
            stack2.push(node);
        }else
        {
            //比较当前元素和辅助栈栈顶元素
            if (node<=stack2.peek()){
                stack2.push(node);
            }else
            {
                //如果当前元素大于辅助栈栈顶，说明加入这个数之后最小元素还是刚才的最小 所以将刚才的栈顶再入栈一次
                stack2.push(stack2.peek());
            }
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        //栈顶元素为数据栈栈顶
        return stack1.peek();
    }

    public int min() {
        //最小值为辅助栈栈顶
        return stack2.peek();
    }

}
