package test10;

import java.util.List;

/**
 * @Auther: wqg
 * @Description:第21题 合并两个有序链表
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class test1 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        if (l1.val<l2.val)
    {
        l1.next=mergeTwoLists(l1.next,l2);
        return l1;
    }
        else
    {
        l2.next=mergeTwoLists(l1,l2.next);
        return l2;
    }
}

}
