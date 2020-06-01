package test26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:字符串的排列
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class test1 {
    public ArrayList<String> Permutation(String str) {
        List<String> res = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, res);
            //对结果排序
            Collections.sort(res);
        }
        return (ArrayList)res;
    }
    //cs为当前操作的数组  i为数组当前下标 list为结果集
    public void PermutationHelper(char[] cs, int i, List<String> list) {
        //如果i指向最后一位 结果集中如果不重复则添加这个字符串
        if (i == cs.length - 1) {
            String val = String.valueOf(cs);
            if (!list.contains(val))
                list.add(val);
        }else {
            //否则就循环交换
            for (int j=i;j<cs.length;j++)
            {
                swap(cs,i,j);
                PermutationHelper(cs,i+1,list);
                swap(cs,i,j);
            }
        }

    }
    //交换函数
    public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}
