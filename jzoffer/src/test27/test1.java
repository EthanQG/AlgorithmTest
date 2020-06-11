package test27;

/**
 * @Auther: wqg
 * @Description:数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class test1 {
    //利用数组特性 超过一半的数字一定比其他数字要多，所以遇到相同的+1 遇到不同的-1 最后一个+1的就是这个数字
    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array.length<=0)
            return 0;
        int count=1;
        int mid=array[0];
        for (int i=1;i<array.length;i++)
        {
            if (count==0)
            {
                mid=array[i];
                count=1;
                System.out.println(mid);
            }
            else if (mid==array[i])
            {
                count++;
            }
            else count--;
        }
        if (!checkMoreThanHalf(array,mid))
            mid=0;
        return mid;
    }
    private static  boolean checkMoreThanHalf(int[] arr, int mid)
    {
        int times=0;
        for (int value : arr) {
            if (value == mid)
                times++;
        }
        boolean result=true;
        if (times*2<=arr.length)
        {
            result=false;
        }
        return result;
    }
    public static void main(String [] args)
    {
        int [] a={1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(a)+"---");
    }
}
