package test3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:
 * @Description:使用滑动窗口
 * 确定左右边界为start end
 * 通过map  k存储元素 v存储元素位置+1  表示下一个不重复的元素坐标
 *随着end后移[start,end)中会有重复元素，那么就改变start坐标为这个重复位置的坐标 此时滑动窗口内不会有重复字符
 */
public class Test32 {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length(),ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int start=0,end=0;end<n;end++)
        {
            char c=s.charAt(end);
            if (map.containsKey(c))
            {
                start=Math.max(start,map.get(c));
            }
            ans=Math.max(ans,end-start+1);
            map.put(c,end+1);

        }

        return ans;
    }
    public static void main(String []args)
    {
        String s="bbbbb";
        int length;
        length=lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
