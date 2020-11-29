package 数据结构.打印链表;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author zheng
 * @description 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * @date 2020/11/5
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        int[] arr = {1, 3, 2};
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        solution.s(head);

        System.out.println(Arrays.toString(solution.reversePrint(head)));
        System.out.println(Arrays.toString(solution.reversePrint2(head)));
        System.out.println(Arrays.toString(solution.reversePrint3(head)));
    }

    /**
     * 遍历链表
     *
     * @param head
     */
    public void s(ListNode head) {
        if (head != null) {
            System.out.println(head.val);
            s(head.next);
        }

    }

    /**
     * 反向遍历:遍历数组
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new LinkedList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int len = list.size();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[len - i - 1] = list.get(i);
        }

        return arr;
    }

    /**
     * LinkedeList 实现栈
     *
     * @param head
     * @return
     */
    public int[] reversePrint2(ListNode head) {
        LinkedList<ListNode> stack = new LinkedList<>();
        ListNode temp = head;
        while (temp != null) {
            stack.add(temp);
            temp = temp.next;
        }

        int len = stack.size();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = stack.removeLast().val;
        }

        return arr;
    }

    /**
     * Stack
     *
     * @param head
     * @return
     */
    public int[] reversePrint3(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        int len = stack.size();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = stack.pop().val;
        }

        return arr;
    }
}
