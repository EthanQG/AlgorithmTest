package test30;

/**
 * @Auther: wqg
 * @Description:递归方法 两两合并
 */
public class test2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0)
            return null;
        ListNode res=lists[0];
        //将lists[0]作为最终合并的链表
        for (int i=1;i<lists.length;i++)
        {
            res=merge(res,lists[i]);
        }
        return res;
    }
    //合并两个有序链表
    private ListNode merge(ListNode a, ListNode b) {
        if(a==null || b==null) {
            return (a==null) ? b : a;
        }
        if(a.val<=b.val) {
            a.next = merge(a.next,b);
            return a;
        } else {
            b.next = merge(a,b.next);
            return b;
        }
    }

}
