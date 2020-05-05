package test3;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Auther: wqg
 * @Description:第三题 从尾到头打印链表
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (listNode==null)
            return list;
        while(listNode!=null)
        {
            list.add(0,listNode.val);
            listNode=listNode.next;

        }
        return list;
    }
}
