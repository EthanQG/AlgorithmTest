package test47;

/**
 * @Auther: wqg
 * @Description:不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class test1 {
    public int Add(int num1,int num2) {
        /*5+17
        101+10001
        先异或得到10100   再与得到进位00001左移一位00010
        异或结果与进位相加10110 即结果22
        * */
        int sum,carry;
        do {
            sum=num1^num2;//两数异或 加法
            carry=num1&num2<<1;//进位
            num1=sum;
            num2=carry;
        }while (carry!=0);//进位不为0继续进行加法处理进位
        return num1;
    }
}
