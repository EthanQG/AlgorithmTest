package test6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther:
 * @Description:leetcode第15题 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c
 * ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 */
public class test6 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int len=nums.length;
        if (len<3||nums==null) return ans;
        Arrays.sort(nums);//对数组排序
        for (int i=0;i<len;i++)
        {
            if (nums[i]>0) break;//当前元素大于0 说明和一定不为0
            if (i>0&&nums[i]==nums[i-1]) continue;//当前元素和上一个元素相同 跳过这次操作 去重
            int L=i+1;
            int R=len-1;
            while(L<R)
            {
                int sum=nums[i]+nums[L]+nums[R];
                if (sum==0)
                {
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum<0) L++;
                else if (sum>0) R--;
            }
        }
        return ans;
    }
    public static void main(String [] args)
    {
        int [] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=threeSum(nums);
        Iterator it=ans.iterator();
        for (;it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}
