package test55;

/**
 * @Auther: wqg
 * @Description:
 */
public class test2 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead==null||pHead.next==null) return pHead;
        ListNode head=new ListNode(-1);
        head.next=pHead;
        ListNode p=head,q=head.next;
        while (q!=null)
        {
            if (q.next!=null&&q.next.val==q.val)
            {
                //结点相同一直走
                while (q.next!=null&&q.next.val==q.val)
                {
                    q=q.next;
                }
                q=q.next;
                p.next=q;
            }
            else
            {
                p=q;
                q=q.next;
            }
        }
        return head.next;
    }
}
