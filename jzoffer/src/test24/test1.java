package test24;

/**
 * @Auther: wqg
 * @Description:复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针random指向一个随机节点），
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class test1 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;
        RandomListNode(int label) {
            this.label = label;
        }
    }
    /*
    *解题思路：
    *1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
    *2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
    *3、拆分链表，将链表拆分为原链表和复制后的链表*/
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead==null) return null;
        RandomListNode cur=pHead;
        //复制每一个结点 复制尾插
        while(cur!=null)
        {
            RandomListNode clone=new RandomListNode(cur.label);
            clone.next=cur.next;
            cur.next=clone;
            cur=clone.next;
        }
        //重新遍历链表 对随即指针进行赋值
        cur=pHead;
        while(cur!=null)
        {
            cur.next.random=cur.random==null?null:cur.random.next;
            cur=cur.next.next;
        }
        //拆分链表
        cur=pHead;
        RandomListNode newhead=cur.next;
        while(cur!=null)
        {
            RandomListNode clone=cur.next;
            cur.next=clone.next;
            clone.next=clone.next==null?null:clone.next.next;
            cur=cur.next;
        }
        return newhead;
    }
}
