package test29;

/**
 * @Auther: wqg
 * @Description:第206题 反转链表
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class test1 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode p=head,q=head;
        ListNode newhead=null;
        while(q!=null)
        {
            q=q.next;
            p.next=newhead;
            newhead=p;
            p=q;
        }
        return newhead;
    }
}
