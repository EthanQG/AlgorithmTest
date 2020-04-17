package test9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:第二十题 有效括号
 * 输入: "{[]}"
 * 输出: true
 */
public class test91 {
    private static final Map<Character,Character> map=new HashMap<Character,Character>(){
        {
            put(')','(');
            put(']','[');
            put('}','{');
        }
    };
    public static boolean isValid(String s)
    {
        if (s.length()%2==1) return false;
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (map.containsKey(c)){
                //读到一个右括号判断是否栈空 如果不空就弹出栈顶 栈顶一定是左括号
                char topElement=stack.isEmpty()?'#':stack.pop();
                //判断弹出的左括号是否是配对
                if (topElement!=map.get(c))
                    return false;
            }
            else{
                //说明不是右括号 将左括号压栈
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }
    public static void main(String []args)
    {
        boolean a=isValid("((()))");
        System.out.println(a);
    }

}
