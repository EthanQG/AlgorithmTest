package test39;

import java.util.HashMap;


/**
 * @Auther: wqg
 * @Description:数组中只出现一次的数字
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class test1 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<array.length;i++)
        {
            if (map.containsKey(array[i]))
                map.put(array[i],2);
            else
                map.put(array[i],1);
        }
        int cnt=0;
        for (int i=0;i<array.length;i++)
        {
            if (map.get(array[i])==1){
                if (cnt==0)
                {
                    num1[0]=array[i];
                    cnt++;
                }else
                    num2[0]=array[i];
            }


        }


    }
}
