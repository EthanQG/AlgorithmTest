package test5;

/**
 * @Auther:
 * @Description:动态规划法 （填表法）
 */
public class test52 {
    public static String longestPalindrome(String s) {
        int len=s.length();
        boolean [][] dp=new boolean[len][len];
        //对角线一定是回文 因为只有一个字符
        for (int i=0;i<len;i++)
        {
            dp[i][i]=true;
        }
        int maxLen=1;//字串最大长度
        int start=0;//字串开始下标
        for (int j=1;j<len;j++)
        {
            for (int i=0;i<j;i++)
            {
                if (s.charAt(i)==s.charAt(j))
                {
                    // [i + 1, j - 1] 不构成区间，即长度严格小于 2即 j - 1 - (i + 1) + 1 < 2 ，整理得 j - i < 3。
                    if (j-i<3) {
                        //小于3说明去掉首尾只剩中间一个 肯定是回文 或者只有两个元素相等 是回文
                        dp[i][j] = true;
                    }else
                    {
                        // ij距离大于3  如果内层是回文 那么整体就是回文 如果内层不是回文 那么外层一定不是回文
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                else
                    dp[i][j]=false;
                //只要dp[i][j]==true成立 表示s[i][j]是回文，此时记录起始和结束
                if (dp[i][j])
                {
                    int cur=j-i+1;
                    if (cur>maxLen) {
                        maxLen = cur;
                        start=i;
                    }
                }
            }

        }
        return s.substring(start, start + maxLen);
    }
    public static void main(String[] args)
    {
        System.out.println(longestPalindrome("abccba"));
    }
}
