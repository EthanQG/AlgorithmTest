package test28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Auther: wqg
 * @Description:最小的k个数
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class test1 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        int len=input.length;
        if (k>len||k==0)
            return result;
        //java的优先级队列是基于堆实现的
        PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);//从大到小 说明队首是最大堆的堆顶
            }
        });
        for (int i=0;i<len;i++)
        {
            if (maxHeap.size()<k)
            {
                maxHeap.offer(input[i]);
            }
            //最大堆堆顶大于当前元素 那么说明这个元素小于最大元素， 放入堆中
            else if (maxHeap.peek()>input[i])
            {
                //将队首元素先获取在remove
                Integer temp=maxHeap.poll();
                temp=null;
                //将该元素放入队列
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer:maxHeap)
        {
            result.add(integer);
        }
        return result;
    }
}
