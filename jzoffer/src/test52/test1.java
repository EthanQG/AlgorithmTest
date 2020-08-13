package test52;

/**
 * @Auther: wqg
 * @Description:表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 *
 */
public class test1 {
    private int index=0;
    public boolean isNumeric(char[] str) {
        //把数字拆分成整数 小数 指数三部分
        if (str.length<1) return false;
        //扫描整数部分是否满足
        boolean flag=scanInteger(str);
        //判断小数部分
        if (index<str.length&&str[index]=='.')
        {
            index++;
            //必须先判断小数部分，否则不能进入指数部分判断
            flag=scanUnsignedInteger(str)||flag;
        }
        if (index<str.length&&(str[index]=='e'||str[index]=='E'))
        {
            index++;
            flag=flag&&scanInteger(str);
        }
        return flag&&index==str.length;
    }

    private boolean scanInteger(char[] str) {
        if (index<str.length&&(str[index]=='+'||str[index]=='-'))
            index++;
        return scanUnsignedInteger(str);
    }

    private boolean scanUnsignedInteger(char[] str) {
        int start=index;
        while(index<str.length&&(str[index]<='9'&&str[index]>='0'))
        {
            index++;
        }
        //判断完+-号后如果index移动说明整数部分有值 如果index没有移动说明整数部分没有值
        return start<index;
    }
}
