package test2;

/**
 * @Auther:
 * @Description:给出两个非空的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class test2 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre =new ListNode(0);
        ListNode cur=pre;
        int carry=0;
        while (l1!=null||l2!=null)
        {
            int x = l1 == null?0:l1.val;
            int y =l2 == null?0:l2.val;
            int sum=x+y+carry;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            carry=sum/10;//进位
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;

        }
        if (carry==1)
            cur.next=new ListNode(carry);
        return pre.next;
    }

}
