package 数据结构.用两个栈实现队列;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author zheng
 * @description 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/5d3i87/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2020/11/9
 */
public class CQueue {
    /**
     * 两个栈实现队列
     * 插入原素:
     *  time: O(1)
     *  memory: O(n)
     * 删除原生：
     *  time: o(1)
     */
    private Stack<Integer> stack1, stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        System.out.println(cQueue.deleteHead());
    }
}


class CQueue1 {
    /**
     * 使用系统自带的队列
     */
    private Queue<Integer> queue;

    public CQueue1() {
        queue = new LinkedList<>();
    }

    public void appendTail(int value) {
        queue.offer(value);
    }

    public int deleteHead() {
        if (queue.size() == 0) {
            return -1;
        } else {
            return queue.poll();
        }
    }

    public static void main(String[] args) {
        CQueue1 queue = new CQueue1();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
    }
}
