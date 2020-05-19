package test8;

/**
 * @Auther: wqg
 * @Description:第八题 （第七题变形） 青蛙跳台
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class test1 {
    //F(n)=F(n-1)+F(n-2)
    public int JumpFloor(int target) {
        if (target==1||target==2)
            return target;
        int one=1;
        int two=2;
        int N = 0;
        for (int i=3;i<=target;i++)
        {
            N=one+two;
            one=two;
            two=N;
        }
        return N;
    }
}
