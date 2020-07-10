package test31;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Auther: wqg
 * @Description:第141题 环形链表
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置。
 * （索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new LinkedHashSet<>();
        //如果set中有重复的head说明有环
        while (head!=null)
        {
            if (set.contains(head))
            {
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    }
}
