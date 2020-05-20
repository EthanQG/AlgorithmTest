package test9;

/**
 * @Auther: wqg
 * @Description:矩形覆盖  仍是斐波那契数列
 *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class test1 {
    //2*8
    /*如果竖着放一个2*1的 那么还有2*7个未放 记作F（7）
    *如果横着放一个1*2的 那么下面还需要一个1*2的 则还有2*6未放 记作F（6）
    * 那么F（n）=F（n-1）+F（n-2）
    *  */
    public int RectCover(int target) {
        if (target==1||target==2)
        {
            return target;
        }
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
