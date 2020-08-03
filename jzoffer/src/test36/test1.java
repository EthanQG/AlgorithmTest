package test36;

/**
 * @Auther: wqg
 * @Description:数组在排序数组中出现的个数
 * 统计一个数字在排序数组中出现的次数。
 * 1，2，3，3，3，3，4，5              3 出现了4次
 */
public class test1 {
    public int GetNumberOfK(int [] array , int k) {
        int cnt=0;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]==k)
                cnt++;
        }
        return cnt;
    }
}
