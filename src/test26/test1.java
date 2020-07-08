package test26;

/**
 * @Auther: wqg
 * @Description:第148题 排序链表 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 */
public class test1 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        //快慢双指针找到中间节点
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        //将分为左右两部分
        ListNode left=sortList(head);
        ListNode right=sortList(temp);
        //合并 先创建一个头结点 然后创建一个res指向头结点 这个h节点用来添加指针需要移动
        ListNode h=new ListNode(0);
        //res永远指向头结点
        ListNode res=h;
        while(left!=null&&right!=null)
        {
            //判断左右两边哪个大  左大链表头就是右边 然后头指针指上来 后移指针
            if (left.val>right.val)
            {
                h.next=right;
                right=right.next;
            }
            else{
                h.next=left;
                left=left.next;
            }
            //头指针指向之后后移准备添加新的节点
            h=h.next;
        }
        //循环结束后判断哪个为空就把另一个的剩余节点挂上来
        h.next=left ==null?right:left;
        return res.next;
    }
}
