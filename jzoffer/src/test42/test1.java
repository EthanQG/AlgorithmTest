package test42;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Auther: wqg
 * @Description:左旋转字符串
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class test1 {
    //对两部分分别进行翻转 然后把整个字符串翻转即可
    /* 拆分abc XYZdef
    *  分别翻转cba fedZYX
    *  再整体翻转XYZdefabc*/
    public static String LeftRotateString(String str,int n) {
        if (str.length()<0||str==null||str.length()<n) return "";
        String str1=str.substring(0,n);
        str1=Reverse(str1,0,str1.length()-1);
        String str2=str.substring(n,str.length());
         str2=Reverse(str2,0,str2.length()-1);
         str=str1+str2;
        return Reverse(str,0,str.length()-1);
    }

    private static String Reverse(String str,int start,int end) {
        if (str.length()<0) return null;
        char []c =str.toCharArray();
        char temp;
        while(start<end)
        {
            temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
        String a="";
        for (int i=0;i<c.length;i++)
        {
            a+=c[i];
        }
        return a;

    }

    public static void main(String [] args)
    {
        System.out.println(LeftRotateString("abcXYZdef",3));
    }
}
