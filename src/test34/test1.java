package test34;

/**
 * @Auther: wqg
 * @Description:第234题 回文链表
 * 输入: 1->2->2->1
 * 输出: true
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode p = new ListNode(-1);
        ListNode fast = p, slow = p;
        p.next = head;
        //找到中间节点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //cur是后半部分的头
        ListNode cur = slow.next;
        ListNode pre = null;
        //断开链表
        slow.next = null;
        //把slow指向头
        slow=p.next;
        //翻转链表
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        while (pre != null)
        {
            if (pre.val!=slow.val)
                return false;
            pre=pre.next;
            slow=slow.next;
        }
        return true;
    }
}
