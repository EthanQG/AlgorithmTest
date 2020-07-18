package test5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:105题 字符串分割
 * 连续输入字符串(输出次数为N,字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入
 * 2
 * abc
 * 123456789
 * 输出
 * abc00000
 * 12345678
 * 90000000
 */
public class test1 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
       while(sc.hasNext())
       {
           int n=Integer.parseInt(sc.nextLine());
           for (int i=0;i<n;i++)
           {
               String str=sc.nextLine();
               strSplit(str);
           }
       }


    }

    private static void strSplit(String str) {
        if (str==null)
            return;
        int a=str.length()%8;
        StringBuilder sb=new StringBuilder(str);
        if (a!=0)
        {
            for (int i=a;i<8;i++)
                sb.append('0');
        }
        str=sb.toString();
        //每8个一输出
        for (int i=0;i<str.length();i+=8)
        {
            System.out.println(sb.substring(i,i+8));
        }
    }
}
