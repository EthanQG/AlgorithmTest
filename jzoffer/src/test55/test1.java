package test55;

import java.util.HashSet;

/**
 * @Auther: wqg
 * @Description:删除列表中的重复结点
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null) return  pHead;
        HashSet<Integer> set=new HashSet<>();
        ListNode p=pHead;
        ListNode q=pHead.next;
        //把重复值保存
        while(q!=null)
        {
            if (p.val==q.val)
            {
                set.add(p.val);
            }
            p=p.next;
            q=q.next;
        }
        //删头
        while (pHead!=null&&set.contains(pHead.val))
        {
            pHead=pHead.next;
        }
        if (pHead==null)
            return null;
        //删中间尾
        p=pHead;
        q=pHead.next;
        while (q!=null)
        {
            if (set.contains(q.val))
            {
                p.next=q.next;
                q=q.next;
            }
            else {
                p=p.next;
                q=q.next;
            }
        }
        return pHead;
    }

}
