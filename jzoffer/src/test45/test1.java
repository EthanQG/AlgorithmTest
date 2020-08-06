package test45;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wqg
 * @Description:圆圈中最后剩下的数字
 * 每年六一儿童节, 牛客都会准备一些小礼物去看望孤儿院的小朋友,
 * 今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。
 * 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,
 * 让编0的号为小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,
 * 然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,
 * ...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 * 如果没有小朋友，请返回-1
 */
public class test1 {
    //约瑟夫环
    class ListNode {

        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) return -1;
        ListNode head=new ListNode(0);
        ListNode node=head;
        for (int i=1;i<n;i++)
        {
            node.next=new ListNode(i);
            node=node.next;
        }
        node.next=head;
        int k=0;
        while (node.next!=node)
        {
            if (++k==m)
            {
                node.next=node.next.next;
                k=0;
            }
            else {
                node=node.next;
            }
        }
        return node.val;
    }
}
