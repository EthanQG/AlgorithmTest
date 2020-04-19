package test11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:第22题 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 */
public class test {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        //深度优先遍历
        dfs("", n, n, res);
        return res;
    }
        /*
         * s:当前递归结果
         * left：左括号剩余个数
         * right：右括号剩余个数
         * res：结果集
         */
        private static void dfs (String s,int left, int right, List<String > res){
            if (left == 0 && right == 0) {
                res.add(s);
                return ;
            }
            //左括号多了 一定不满足
            if (left > right)
                return;
            if (left > 0) {
                dfs(s+"(", left - 1, right, res);
            }
            if (right > 0) {
                dfs(s+")", left, right - 1, res);
            }
        }

    public static void main(String [] args)
    {
        int n=3;
        List<String> list=generateParenthesis(n);
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
