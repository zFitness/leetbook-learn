package 数据结构.反转链表;

/**
 * @author zheng
 * @description 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * @date 2020/11/15
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp = head.next;
        head.next = null;
        while (temp != null) {
            ListNode temp2 = temp.next;
            temp.next = head;
            head = temp;
            temp = temp2;
        }
        return head;
    }
}
