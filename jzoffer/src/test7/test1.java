package test7;

/**
 * @Auther: wqg
 * @Description:第七题 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 */
public class test1 {
    public int Fibonacci(int n) {
        int [] result={0,1};
        if(n<2)
            return result[n];
        int one=0;
        int two=1;
        int N=0;
        for (int i=2;i<=n;i++)
        {
            N=one+two;
            one=two;
            two=N;
        }
        return N;
    }
}
