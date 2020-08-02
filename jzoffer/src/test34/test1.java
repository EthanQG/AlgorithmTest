package test34;

/**
 * @Auther: wqg
 * @Description:数组中的逆序对
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class test1 {
    public int result=0;
    public int InversePairs(int [] array) {
        mergeCount(array,0,array.length-1);
        return result;
    }
    public void mergeCount(int[] nums, int left, int right){
        if (left>=right) return;
        int mid=(right+left)/2;
        mergeCount(nums,left,mid);
        mergeCount(nums,mid+1,right);
        merge(nums,left,mid,right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int [] temp=new int[right-left+1];
        //mid是第一个数组的最后 j是第二个数组的开始
        int k=0,i=left,j=mid+1;
        while(i<=mid&&j<=right)
        {
            //从左右两个数组中 前面的小于后面的 不能构成逆序对
            if (nums[i]<=nums[j])
            {
                //把小的放进入
                temp[k++]=nums[i++];
            }
            //前面的大于后面的  说明前面数组之后的所有数都能和后面数组的这意味构成逆序对 那么算出前面数组元素的个数即可 mid-i+1
            else{
                temp[k++]=nums[j++];
                result=(result+(mid-i+1))%1000000007;
            }
        }
        //把两个数组剩余元素放入辅助数组 所有两个数组的循环只会执行一个 必定有一个已经被放完
        while(i<=mid)
            temp[k++]=nums[i++];
        while(j<=right)
            temp[k++] = nums[j++];
        //将临时数组的元素放入原来的数组中
        for (int m=0;m<k;m++)
            nums[left+m]=temp[m];
    }
}
