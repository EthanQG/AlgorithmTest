package test18;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: wqg
 * @Description:顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 * 13 14 15 16 则依次打印出数字
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class test1 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return result;
        }
        int up=0,down=matrix.length-1,left=0,right=matrix[0].length-1;
        while(true)
        {
            //最上面一行
            for (int col=left;col<=right;col++)
            {
                result.add(matrix[up][col]);
            }
            //向下
            up++;
            //判断是否越界
            if (up>down) break;
            //最右一列
            for (int row=up;row<=down;row++)
            {
                result.add(matrix[row][right]);
            }
            //向左
            right--;
            //判断是否越界
            if (right<left) break;
            //最下面一行
            for (int col=right;col>=left;col--){
                result.add(matrix[down][col]);
            }
            //向上
            down--;
            //判断是否越界
            if (down<up) break;
            //最左一行
            for (int row=down;row>=up;row--)
            {
                result.add(matrix[row][left]);
            }
            //向右
            left++;
            //判断是否越界
            if (left>right) break;
        }
        return result;
    }

}
