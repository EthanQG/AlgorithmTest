package test29;

/**
 * @Auther: wqg
 * @Description:连续子数组最大和
 */
public class test1 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0||array==null)
            return 0;
        int sum=0;//记录累计和
        int max=array[0];//记录当前最大和
        for (int i=0;i<array.length;i++)
        {
            //只有在sum<=0的时候碰到正数才将这个正数记为sum的和 其他情况不论正负就累加 然后判断sum和max的值
            if (sum<=0)
                sum=array[i];
            else
                sum+=array[i];
            //比较sum和max  保存max
            if (sum>max)
                max=sum;
        }
        return max;
    }
}
