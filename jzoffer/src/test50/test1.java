package test50;

import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:构件乘积数组
 * 给定一个数组A[0, 1, ..., n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 */
public class test1 {
    public int[] multiply(int[] A) {
        int [] B=new int[A.length];
        int temp;
        for(int i=0;i<A.length;i++)
        {
            //把每个A[i]=1,每一项的值就相当于所有项的乘积除去A[i] 所以临时把A[i]变为1，最后在赋值回来
            temp=A[i];
            A[i]=1;
            B[i]=1;
            for (int j=0;j<A.length;j++)
            {
                B[i]*=A[j];
            }
            A[i]=temp;
        }
        return B;
    }
}
