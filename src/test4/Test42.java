package test4;

/**
 * @Auther: 王庆归
 * @Description:
 */
public class Test42 {
    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int len = m + n;
        int left = -1, right = -1;//left存左边的数  right存右边的数
        int a = 0, b = 0;//ab表示两个数组的下标
       for (int i=0;i<=len/2;i++)//i为计数器 判断循环次数  长度为len那么中位数就需要判断len/2+1次
       {
           left=right;
           if (a<m&&(b>=n||A[a]<B[b]))
               right=A[a++];
           else
               right=B[b++];

       }
       if (len%2==0) return (left+right)/2.0;
       return right;
    }

    public static void main(String []args)
    {
        int nums1[]={1,3,4};
        int nums2[]={2,5};
        double mid=findMedianSortedArrays(nums1,nums2);
        System.out.println(mid);
    }
}
