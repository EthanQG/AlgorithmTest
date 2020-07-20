package test6;

import java.util.Scanner;

/**
 * @Auther: wqg
 * @Description:
 */
public class test2 {

    // 转化成求最长递增子序列
    public static int getMaxSteps(int [] arr ,int n) {
        int [] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j]<arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        // 找到dp数组中的最大值即可
        int max = 0;
        for (int i = 0; i < dp.length; i++)
            if (dp[i]>max) {
                max = dp[i];
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = input.nextInt();
            System.out.println(getMaxSteps(a, n));
        }
    }

}
