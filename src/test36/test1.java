package test36;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:151题 翻转字符串中的单词
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class test1 {

    public String reverseWords(String s) {
        s = s.trim();//删除前后空格
        int i=s.length()-1,j=i;
        StringBuilder sb=new StringBuilder();
        while(i>=0)
        {
            while(i>=0&&s.charAt(i)!=' ') i--;//i不为空格就一直找到i为空格的时候停下来
            sb.append(s.substring(i+1,j+1)+" ");//左闭右开 截取i+1到j 然后放入sb中
            while(i>=0&&s.charAt(i)==' ')i--;//跳过空格
            j=i;//把j指上i 继续添加下一个
        }
        return sb.toString().trim();

    }
}
