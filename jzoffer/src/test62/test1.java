package test62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Auther: wqg
 * @Description:数据流中的中位数
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class test1 {
    ArrayList<Integer> array=new ArrayList<>();
    public void Insert(Integer num) {
        array.add(num);
    }

    public Double GetMedian() {
        Collections.sort(array);
        int index=array.size()/2;
        if (array.size()%2==0) return((double)(array.get(index-1))+(double)array.get(index))/2;
        return (double)array.get(index);
    }


}
