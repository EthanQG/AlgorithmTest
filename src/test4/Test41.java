package test4;

/**
 * @Auther:
 * @Description:给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 *
 *
 * 暴力破解
 */
public class Test41 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1= nums1.length;
        int l2=nums2.length;
        int [] nums=new int[l1+l2];
        //一个数组为空 只剩一个数组的情况
        if (l1==0)
        {
            if (l2%2==0)
            {
                return (nums2[l2/2-1]+nums2[l2/2])/2.0;
            }
            else return nums2[l2/2];
        }
        if (l2==0)
        {
            if (l1%2==0)
            {
                return (nums1[l1/2-1]+nums1[l1/2])/2.0;
            }
            else return nums1[l1/2];
        }
        //合并两个数组 返回中位数
        int index=0,i=0,j=0;
        while(index!=(l1+l2))
        {
            //l1短  已经结束 那么把l2剩余部分复制过来
            if (i==l1)
            {
                while(j<l2)
                    nums[index++]=nums2[j++];
                break;
            }
            //l2短  已经结束 那么把l1剩余部分复制过来
            if (j==l2)
            {
                while(i<l1)
                    nums[index++]=nums1[i++];
                break;
            }
            if (nums1[i]<nums2[j])
                nums[index++]=nums1[i++];
            else
                nums[index++]=nums2[j++];

        }
        if (index%2==0) return (nums[index/2-1]+nums[index/2])/2.0;
        return nums[index/2];
    }
    public static void main(String []args)
    {
        int nums1[]={1,2};
        int nums2[]={3,4};
        double mid=findMedianSortedArrays(nums1,nums2);
        System.out.println(mid);
    }
}
