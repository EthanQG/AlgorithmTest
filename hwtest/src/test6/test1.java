package test6;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:103题 Redraiment的走法
 * Redraiment是走梅花桩的高手。Redraiment总是起点不限，
 * 从前到后，往高的桩子走，但走的步数最多，不知道为什么？你能替Redraiment研究他最多走的步数吗？
 * 样例输入
 * 6
 * 2 5 1 5 4 5
 * 样例输出
 * 3
 * Example:
 * 6个点的高度各为 2 5 1 5 4 5
 * 如从第1格开始走,最多为3步, 2 4 5
 * 从第2格开始走,最多只有1步,5
 * 而从第3格开始走最多有3步,1 4 5
 * 从第5格开始走最多有2步,4 5
 * 所以这个结果是3。
 */
public class test1 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for (int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        Stack<Integer> s=new Stack();
        int max=1;
        for (int i=0;i<n;i++)
        {
             s.push(nums[i]);
            for (int j=i+1;j<n;)
            {
                int l=1;//当前
                if (nums[j]>s.peek())
                {
                    s.push(nums[j]);
                    if (s.size()>max) max=s.size();
                    j++;
                }

                else if(nums[j]<s.peek()&&nums[j]<nums[i]||nums[j]==s.peek())
                    j++;
                else if(nums[j]<s.peek()&&nums[j]>nums[i])
                {
                   while(!s.isEmpty())
                   {
                       s.pop();
                   }
                    s.push(nums[i]);
                    s.push(nums[j]);
                    if (s.size()>max) max=s.size();
                    j++;
                }
            }
            while(!s.isEmpty())
            {
                s.pop();
            }
        }
        System.out.println(max);


    }
}
