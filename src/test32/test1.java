package test32;

/**
 * @Auther: wqg
 * @Description:142题 环形链表Ⅱ
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(true)
        {
            if (fast==null||fast.next==null)
                return null;
            fast=fast.next.next;
            slow=slow.next;
            //第一次相遇后跳出
            if (fast==slow) break;
        }
        //构建第二次相遇
        fast=head;
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
