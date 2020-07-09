package test30;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Auther: wqg
 * @Description:第23题 合并k个排序链表
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class test1 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  //堆实现
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0)
            return null;
        //新建一个最小堆
        PriorityQueue<ListNode> queue=new PriorityQueue(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1,ListNode l2) {
                return (l1.val-l2.val);
            }
        });
        //将每个链表的每个节点都放入
        for (int i=0;i<lists.length;i++)
        {
            while(lists[i]!=null)
            {
                queue.add(lists[i]);
                lists[i]=lists[i].next;
            }
        }
        ListNode temp=new ListNode(0);
        ListNode head=temp;
        //把堆顶依次排出 连接起来
        while(!queue.isEmpty())
        {
            temp.next=queue.poll();
            temp=temp.next;
        }
        temp.next=null;
        return head.next;
    }
}
