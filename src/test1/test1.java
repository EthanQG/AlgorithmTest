package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Auther:
 * @Description:给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */

class test1 {
    //暴力破解
    public static int[] twoSum(int[] nums, int target) {

        int [] result=new int[2];
        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if (nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }


        }
        return result;
    }
    //两遍哈希
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if (map.containsKey(complement)&&map.get(complement)!=i)
            {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    //一遍哈希
    public static int[] twoSum2(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
    }
    public static void main (String args[])
    {
        int[] nums=new int[] {4,5,8,9,6,3,1,14};
        int target=5;
        int [] result=twoSum2(nums,target);
        System.out.println(result[0]+"=="+result[1]);

    }
}
