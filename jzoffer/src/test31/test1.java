package test31;

/**
 * @Auther: wqg
 * @Description:把数组排成最小的数
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class test1 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null||numbers.length==0)
            return "";
        //遍历数组从小到大排序
        for (int i=0;i<numbers.length;i++)
        {
            for (int j=i+1;j<numbers.length;j++)
            {
                //前后拼接然后比较
                String sum1=String.valueOf(numbers[i])+String.valueOf(numbers[j]);
                String sum2=String.valueOf(numbers[j])+String.valueOf(numbers[i]);
                //sum1比sum2大 说明ij>ji 交换顺序
                if (sum1.compareTo(sum2)>0)
                {
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        //顺序拼接
        String str="";
        for (int i=0;i<numbers.length;i++)
        {
            str=str+String.valueOf(numbers[i]);
        }
        return str;
    }
}
