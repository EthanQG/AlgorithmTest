package test36;

import java.util.Arrays;

/**
 * @Auther: wqg
 * @Description:
 */
public class test2 {
    public int GetNumberOfK(int [] array , int k) {
        int index= Arrays.binarySearch(array,k);
        if (index<0) return 0;
        int cnt=1;
        for (int i=index+1;i<array.length&&array[i]==k;i++)
            cnt++;
        for (int i=index-1;i>=0&&array[i]==k;i--)
            cnt++;
        return cnt;
    }
}
