package test41;

import java.util.ArrayList;

/**
 * @Auther: wqg
 * @Description:和为S的两个数字
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class test1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res=new ArrayList<>();
        if (array==null||array.length<=1) return res;
        int a=0,b=array.length-1;
        while (a<b)
        {
            if (array[a]+array[b]==sum){
                res.add(array[a]);
                res.add(array[b]);
                break;
            }else if (array[a]+array[b]<sum) a++;
            else b--;
        }
        return res;
    }
}
