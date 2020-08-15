package test54;

/**
 * @Auther: wqg
 * @Description:链表中环的入口结点
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead==null||pHead.next==null)
            return null;
        ListNode fast=pHead;
        ListNode slow=pHead;
        while (fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow)
            {
                ListNode slow2=pHead;
                while (fast!=slow2)
                {
                    fast=fast.next;
                    slow2=slow2.next;
                }
                return fast;
            }
        }
        return null;
    }
}
