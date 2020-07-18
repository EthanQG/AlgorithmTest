package test3;

import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:107题 求立方根
 */
public class test1 {
    /*f(x) = x3 - y
    * 牛顿迭代公式 x = x0 - f(x0) / f `(x0)
    * 即x=x0-(x^3-y)/3*x^2
    * 满足条件x^3-y<-1*10^5即可的解*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (input.hasNextDouble()){
            double num = input.nextDouble();
            double x = 1.0;
            //Math.abs()获取绝对值
            for (; Math.abs(Math.pow(x,3)-num)>1e-3; x=x-((Math.pow(x,3)-num)/(3*Math.pow(x,2))));
            System.out.println(String.format("%.1f", x));
        }
    }
}
