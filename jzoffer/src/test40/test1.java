package test40;

import java.util.ArrayList;

/**
 * @Auther: wqg
 * @Description:和为S的连续正数序列
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class test1 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (sum <= 0) return ans;
        int left = 1, right = 2, sumVal = left + right;
        while (left <= sum / 2) {
            if (sumVal < sum) {
                right++;
                sumVal += right;
            } else if (sumVal > sum) {
                sumVal -= left;
                left++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    list.add(i);
                }
                ans.add(list);
                right++;
                sumVal += right;
            }
        }
        return ans;
    }
}
