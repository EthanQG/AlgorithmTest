package test46;

/**
 * @Auther: wqg
 * @Description:求1+2+3+...+n
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class test1 {
    /*等差数列求和公式sum=(a1+an)*n/2
    * 即(1+n)*n/2 化简 (n+n^2)/2*/
    public int Sum_Solution(int n) {
        int sum=(int)Math.pow(n,2)+n;
        //除2相当于右移一位
        return sum>>1;
    }
}
