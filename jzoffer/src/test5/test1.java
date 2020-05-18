package test5;

import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:第五题 用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class test1 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size()<=0)
        {
            while(stack1.size()!=0)
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
