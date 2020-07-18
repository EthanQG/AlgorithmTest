package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


/**
 * @Auther: wqg
 * @Description:106题 记负均正Ⅱ
 * 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数，如果没有非负数，则平均值为0
 * 本题有多组输入数据，输入到文件末尾，请使用while(cin>>)读入
 * 输入
 * -13
 * -4
 * -7
 * 输出
 * 3
 * 0.0
 */
public class test1 {
    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] strings=reader.readLine().split(" ");
        int l=0;//负数个数
        int r=0;//正数个数
        double sum=0;//正数的和
        for (int i=0;i<strings.length;i++)
        {
            int temp=Integer.parseInt(strings[i]);
            if (temp<0)
                l++;
            if (temp>0)
            {
                r++;
                sum+=temp;
            }
        }
        //输出负数个数
        System.out.println(l);
        if (r>0)
        {
            DecimalFormat decimalFormat = new DecimalFormat(".#");
            System.out.println(decimalFormat.format(sum/r));
        }else
            System.out.println(0.0);
    }
}
