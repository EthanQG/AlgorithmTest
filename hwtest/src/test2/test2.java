package test2;

import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:106题 字符逆序
 * 题目描述
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 * 如：输入“I am a student”，输出“tneduts a ma I”。
 */
public class test2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }

}
