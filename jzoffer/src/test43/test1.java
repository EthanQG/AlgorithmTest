package test43;

/**
 * @Auther: wqg
 * @Description:翻转单词序列
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
 * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
 * 但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class test1 {
    public static String ReverseSentence(String str) {
        /*student. a am I
         * I ma a .tneduts
         * I am a student.*/
        if (str.trim().length() == 0||str==null) return str;
        char [] c=str.toCharArray();
        System.out.println(c.length+" "+str.length());
        //对整个字符串进行翻转
        reverseChars(c,0,str.length()-1);//I ma a .tneduts
        //对l~r之间的字符进行翻转
        int l=0,r=0;
        while (l<str.length())
        {
            //如果r碰到了空格 说明l~r是一个单词 进行翻转
            if (c[r]==' ')
            {
                reverseChars(c,l,r-1);
                //翻转之后l=r+1
                r++;
                l=r;
            }
            if (r==str.length()-1)
            {
                reverseChars(c,l,r);
                break;
            }
            r++;
        }
        return String.valueOf(c);
    }
    //交换
    private static  void reverseChars(char[] c, int l, int r) {
        char temp;
        while(l<r)
        {
            temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String [] args)
    {
        System.out.println(ReverseSentence("student. a am I"));
    }
}
