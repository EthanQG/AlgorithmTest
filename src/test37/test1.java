package test37;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wqg
 * @Description:169多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 */
public class test1 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            if (!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else if (map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
                if (map.get(nums[i])>nums.length/2)
                    return nums[i];
            }

        }
        return nums[0];
    }
}
