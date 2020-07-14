package test30;

/**
 * @Auther: wqg
 * @Description:整数中1出现的次数（从1到n整数中1出现的次数）
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class test1 {
    public int NumberOf1Between1AndN_Solution(int n) {
        //个位上的1  n/10*1+(n%10==1?1:0);
        //十位上的1  k=n%100    (n/100)*10+(if(k > 19) 10 else if(k < 10) 0 else k - 10 + 1)
        //百位上的1 在百位只有100-199上会有10次  k=n%1000 (n/1000)*100+ if(k>199) 100 else if(k<100)0 else k-100+1
        //把个位的1也总结成公式 k=n%10 (n/10)*1+if(k>1) 1 else if(k<1) 0 else k-1+1
        //归纳 k=n%(i*10) count(i)=(n/i*10)*i+if(k>)

        int count=0;
        StringBuffer s=new StringBuffer();
        for(int i=1;i<n+1;i++){
            s.append(i);
        }
        String str=s.toString();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                count++;
        }
        return count;
    }

}
