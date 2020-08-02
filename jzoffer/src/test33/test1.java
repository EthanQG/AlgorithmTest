package test33;

/**
 * @Auther: wqg
 * @Description:第一个只出现一次的字符
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class test1 {
    public int FirstNotRepeatingChar(String str) {
        if (str.length()<=0||str==null) return -1;
        int []hash=new int[256];
        for (int i=0;i<str.length();i++)
        {
            hash[str.charAt(i)]++;
        }
        for (int i=0;i<str.length();i++)
        {
            if (hash[str.charAt(i)]==1)
                return i;
        }

        return -1;
    }

}
