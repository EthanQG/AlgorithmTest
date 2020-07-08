package test27;

import java.util.Arrays;

/**
 * @Auther: wqg
 * @Description:第56题 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 */
public class test1 {
    public int[][] merge(int[][] intervals) {
        //传来两个值v1 v2 判断他们的先后顺序按照v1[0]和v2[0]的比较结果 v1[0]>v2[0]则v1>v2
        Arrays.sort(intervals,(v1,v2)->v1[0]-v2[0]);
        int [][] res=new int[intervals.length][2];
        int index=-1;
        for (int [] interval:intervals)
        {
            //如果res结果为空直接添加 遍历intervals的每一个区间
            //若当前区间左小于最后res中最后一个右 那么合并 如果不小于那就不合并直接添加该区间
            if (index==-1||interval[0]>res[index][1])
            {
                //res为空添加这个区间或者当前区间的起始位置大于res中的终止位置 那么直接添加
                res[++index]=interval;
            }
            else{
                //当前区间的起始位置小于res的终止位置 那么比较起始位置和res的终止位置大小进行更改 合并
                res[index][1]=Math.max(res[index][1],interval[1]);
            }
        }
        //因为index=-1 所以copy时需要从0开始copy
        return Arrays.copyOf(res,index+1);
    }
}
