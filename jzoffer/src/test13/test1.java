package test13;

/**
 * @Auther: wqg
 * @Description:链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null)
            return null;
        ListNode q=head,p=head;
        for (int i=0;i<k;i++)
        {
            if (p==null)
                return null;
            p=p.next;

        }

        while(p!=null)
        {
            p=p.next;
            q=q.next;
        }
        return q;
    }
}
