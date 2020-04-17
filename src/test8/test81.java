package test8;

/**
 * @Auther: wqg
 * @Description:第19题 删除链表倒数第n个结点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class test81 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode pre = new ListNode(0);
                pre.next=head;
                ListNode p=pre,q=pre;
                while(n!=0)
                {
                    p=p.next;
                    n--;
                }
                while(p.next!=null)
                {
                    p=p.next;
                    q=q.next;
                }
                q.next=q.next.next;
                return pre.next;
    }

}
