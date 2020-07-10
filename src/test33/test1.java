package test33;

/**
 * @Auther: wqg
 * @Description:160题 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha=headA,hb=headB;
        while(ha!=hb)
        {
            ha= ha ==null ?headB:ha.next;
            hb= hb==null?headA:hb.next;
        }
        return ha;
    }
}
