package test49;

import java.util.HashSet;

/**
 * @Auther: wqg
 * @Description:
 */
public class test2 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<length;i++)
        {
            if (set.contains(numbers[i]))
            {
                duplication[0]=numbers[i];
                return true;
            }else {
                set.add(numbers[i]);
            }
        }
        return false;
    }
}
