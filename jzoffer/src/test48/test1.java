package test48;

/**
 * @Auther: wqg
 * @Description:把字符串转化为整数
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 */
public class test1 {
    public static int StrToInt(String str) {
        if (str==null|| str.trim().equals("")) return 0;
        str=str.trim();
        char [] c=str.toCharArray();
        int res=0,bndry=Integer.MAX_VALUE/10;
        int flag=1;
        int i=1;
        if (c[0]=='-') flag=-1;
        else if (c[0]!='+') i=0;
       for (int j=i;j<c.length;j++)
       {
           if (c[j]<'0'||c[j]>'9') return 0;
           //判断越界  res大于最大值 或res+c[j]超出界限
           if (res>bndry||res==bndry&&c[j]>'7')  return 0;
           res=res*10+(c[j]-'0');
       }
        return res*flag;
    }
    public static void main(String [] args)
    {
        StrToInt("1a33");
    }
}
