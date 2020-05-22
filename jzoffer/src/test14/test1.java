package test14;

import java.util.List;

/**
 * @Auther: wqg
 * @Description:反转链表
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if (head==null||head.next==null)
        {
            return head;
        }
        ListNode pre=null;//当前节点的前一个结点
        ListNode next=null;//当前节点的后一个结点
        while (head!=null)
        {
            next=head.next;//保存下一个结点
            head.next=pre;//当前结点指向前一个结点
            pre=head;//前一个结点右移到当前结点
            head=next;//旧链的新的头指针就是刚刚保存的下一个结点
        }
        return pre;
    }
}
