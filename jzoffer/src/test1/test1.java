package test1;

/**
 * @Auther: wqg
 * @Description:剑指offer第一题
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class test1 {
    public static boolean Find(int target, int [][] array) {
        int row=array.length;
        int col=array[0].length;
        int i=0,j=col-1;
        boolean find=false;
        while(i<row&&j>=0)
        {
            int value=array[i][j];
            if (value<target)
                i++;
            else if(value>target)
                j--;
            else
            {
                find=true;
                break;
            }
        }
        return find;
    }

}
