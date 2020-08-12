package test51;

/**
 * @Auther: wqg
 * @Description:正则表达式匹配
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class test1 {
    public boolean match(char[] str, char[] pattern)
    {
        if (str==null||pattern==null)
            return false;
        return matchCore(str,0,pattern,0);

    }

    private boolean matchCore(char[] str, int s, char[] pattern, int p) {
        //两指针都指向最后才匹配成功
        if (s == str.length && p == pattern.length)
            return true;
        if (s<str.length && p==pattern.length)
            return false;
        //p下一个指向*
        if (p+1<pattern.length&&pattern[p+1]=='*')
        {
            //出现了*，并且s和p指向相同，三种情况并列
            if ((s<str.length&&pattern[p]=='.')||(s<str.length&&pattern[p]==str[s]))
            {
                //abcd和ab*cf s和p指向相等的 p下一个是* 那么p就跳过这个指向c 把s同时也指向下一个
                return matchCore(str,s+1,pattern,p+2)
                        //abbcd和ab*cf 同时指向b相等，p下一个是* 说明p指向的出现了多次，那么此时让s移动即可
                        ||matchCore(str,s+1,pattern,p)
                        //cba和cb*a*a 出现这种情况认为p指向的第一个a没有出现过，直接跳过
                        ||matchCore(str,s,pattern,p+2);
            }else
            {
                //出现了*，但是s和p指向不同，可以理解为p指向的*字母出现了0次 直接后移
                return matchCore(str, s, pattern, p + 2);
            }
        }
        //p下一个不是*，进行常规判断是否相等 相等就后移
        if (s<str.length&&(pattern[p]==str[s]||pattern[p]=='.'))
        {
            return matchCore(str,s+1,pattern,p+1);
        }
        //p后面不是*也不是. 说明不会相等
        return false;

    }
}
