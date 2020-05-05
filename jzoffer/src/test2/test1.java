package test2;

/**
 * @Auther: wqg
 * @Description:第二题 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class test1 {
    public String replaceSpace(StringBuffer str) {
        int spacenum=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                spacenum++;
            }
        }
        int oldlen=str.length();
        int newlen=oldlen+spacenum*2;
        str.setLength(newlen);
        int oldindex=oldlen-1;
        int newindex=newlen-1;
        for (;oldindex>=0&&oldindex<newindex;oldindex--)
        {
            if (str.charAt(oldindex)==' ')
            {
                str.setCharAt(newindex--,'0');
                str.setCharAt(newindex--,'2');
                str.setCharAt(newindex--,'%');
            }
            else
            {
                str.setCharAt(newindex--,str.charAt(oldindex));
            }

        }
        return str.toString();
    }
}
