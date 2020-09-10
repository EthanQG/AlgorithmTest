package test62;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Auther: wqg
 * @Description:
 */
public class test2 {
    //小顶堆,堆顶是最小值,存放的较大的数
    PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    //大顶堆，堆顶是最大值，存放较小的数
    PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    int cnt=0;//记录元素个数
    public void Insert(Integer num) {
        if (cnt%2==0)
        {//如果是偶数个数，先添加到大顶堆中，再把大顶堆的最大值放入小顶堆
            maxHeap.offer(num);
            int max=maxHeap.poll();
            minHeap.offer(max);
        }//如果是奇数个，先添加到小顶堆，再把小顶堆的最小值放入大顶堆
        else {
            minHeap.offer(num);
            int min=minHeap.poll();
            maxHeap.offer(min);
        }
        cnt++;
    }
    public Double GetMedian() {
        if (cnt%2==0) return ((double)(maxHeap.peek())+(double)(minHeap.peek()))/2;
        else return (double) minHeap.peek();

    }
}
