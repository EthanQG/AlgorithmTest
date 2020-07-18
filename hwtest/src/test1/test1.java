package test1;

import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:108题 最小公倍数
 */
public class test1 {
    //最小公倍数等于两数相乘除以最大公约数
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a*b/gcd(a,b));
    }
    public static int gcd(int a,int b)
    {
        int m=a;
        while((a%m)!=0||(b%m)!=0)
            m--;
        return m;
    }
}
