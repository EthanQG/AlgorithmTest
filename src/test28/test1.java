package test28;

/**
 * @Auther: wqg
 * @Description:第75题 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 */
public class test1 {
    /*
    * [0,zero) 0
    * [zero i) 1
    * [two len-1] 2*/
    public void sortColors(int[] nums) {
        int len=nums.length;
        if (len<2)
            return;
        int zero=0;
        int two=len;
        int i=0;
        while(i<two)
        {
            //如果是0 就换到zero处 zero+1向后
            if (nums[i]==0)
            {
                swap(nums,i,zero);
                zero++;
                i++;
            }
            //如果是1就不管 继续往后走
            else if (nums[i]==1)
                i++;
            //如果是2就和two交换 把2都放在后面
            else{
                two--;
                swap(nums,two,i);
            }
        }
    }
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
