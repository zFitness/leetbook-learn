package 数据结构.复杂链表的复制;

/**
 * @author zheng
 * @description TODO
 * @date 2020/11/15
 */
public class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head, temp2 = null;
        Node newHead = null;

        while (temp != null) {
            Node node = new Node(temp.val);
            node.next = null;
            node.random = null;
            if (newHead == null) {
                newHead = node;
                temp2 = node;
            } else {
                temp2.next = node;
                temp2 = node;
            }
            temp = temp.next;

        }

        return newHead;
    }
}


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}