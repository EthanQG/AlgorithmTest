package test12;

/**
 * @Auther: wqg
 * @Description:调整数组顺序使奇数位在偶数位之前
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class test1 {
    public static void reOrderArray(int[] a) {
        if (a == null || a.length == 0)
            return;
        int i = 0, j;
        while (i < a.length) {
            //找到第一个偶数
            /*!isEven(a[i])为假跳出循环 为假条件是isEven(a[i])为真 说明a[i]是偶数 */
            while (i < a.length && !isEven(a[i]))
                i++;
            j = i + 1;
            //找到第一个奇数  a[j]是奇数
            while (j < a.length && isEven(a[j]))
                j++;
            if (j < a.length) {
                //在[i,j-1]交换偶数和奇数
                int tmp = a[j];
                for (int j2 = j - 1; j2 >= i; j2--) {
                    a[j2 + 1] = a[j2];
                }
                a[i++] = tmp;
                for (int m:a) {
                    System.out.print(m+" ");
                }
                System.out.println();
            } else {// 查找失敗
                break;
            }
        }
    }
    static boolean isEven ( int n){
        if (n % 2 == 0)
            return true;
        return false;
    }

    public static void main(String [] args)
    {

        int [] a={1,2,4,5,8,9,10,11,15};
        int i=0;
        reOrderArray(a);
    }
}
