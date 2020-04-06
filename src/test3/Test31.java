package test3;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther:
 * @Description:给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
/*暴力破解
* 1.先遍历所有字串  开始和结束的索引是i和j
* i  0~n-1
* j  i+1~n
* 2.在遍历过程中加入元素时要保证不重复，所以用set去验证每一个元素是否存在
*   不存在则加入到set中  存在返回false
*
* */
public class Test31 {
    public static int lengthOfLongestSubstring(String s) {
        //字符串长度
        int length =s.length();
        int ans=0;
        for (int i=0;i<length;i++)
        {
            for (int j=i+1;j<=length;j++)
            {
                if (allUnique(s,i,j))
                    ans=Math.max(ans,j-i);
            }
        }
        return ans;
    }
    public static boolean allUnique(String s, int start, int end)
    {
        Set<Character> set=new HashSet<>();
        for (int i=start;i<end;i++)
        {
            Character ch=s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    public static void main(String []args)
    {
        String s=" ";
        int length;
        length=lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
