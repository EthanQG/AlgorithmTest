package test7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class test7 {

    String[] letter_map = {" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits==null||digits.length()==0)
        {
            return new ArrayList<>();
        }
        iterStr(digits,"",0);
        //输出结果列表
        return res;
    }
    List<String> res = new ArrayList<>();
    //index用来吧表示当前是字符串中的哪一位
    void iterStr(String str, String letter, int index)
    {
          if (index==str.length())
          {
              res.add(letter);
              return;
          }
          //c为获取当前字符
        char c = str.charAt(index);
          //c-'0'就可以得到数组中的字符
        int pos=c-'0';
        //得到按的这个数字表示的字符串
        String map_string=letter_map[pos];
        //遍历字符串
        for (int i=0;i<map_string.length();i++)
        {
            //调用递归
            iterStr(str,letter+map_string.charAt(i),index+1);
        }
    }

}
