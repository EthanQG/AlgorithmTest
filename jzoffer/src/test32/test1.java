package test32;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:丑数
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class test1 {
    public static void main(String []args)
    {
        int n=2;
        int p2=0,p3=0,p5=0;//指向235倍的数字序列
        /*1 *(2 3 5)=2 3 5  2 3 5再分别*2 3 5 三个指针指向各自乘的序列
        每个序列都是从小到大有顺序 所以只需要依次找到最小的放入数字即可
        * p2->2 4 6 10
        * p3->3 6 9 15
        * p5->5 10 15 25 */
        int [] res=new int[n];
        res[0]=1;//最小的丑数是1
        for (int i=1;i<n;i++)
        {
            //一次遍历235的序列 得到最小的放入结果中
            res[i]=Math.min(res[p2]*2,Math.min(res[p3]*3,res[p5]*5));
            //如果每一个倍数的数字放入一次那就向后一位
            if (res[i]==res[p2]*2) p2++;
            if (res[i]==res[p3]*3) p3++;
            if (res[i]==res[p5]*5) p5++;
        }
        //最后一位就是第n个丑数
        System.out.println(res[n-1]);
    }

}

