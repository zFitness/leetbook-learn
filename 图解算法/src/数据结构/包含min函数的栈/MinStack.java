package 数据结构.包含min函数的栈;

import java.util.LinkedList;

/**
 * @author zheng
 * @description 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * 辅助栈
 * @date 2020/11/10
 */
class MinStack {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        stack.addLast(x);
        if (minStack.size() == 0 || minStack.getLast() >= x) {
            minStack.addLast(x);
        }
    }

    public void pop() {
        Integer i = stack.removeLast();
        //包装类 Integer，用 equals来比较
        if (minStack.getLast().equals(i)) {
            minStack.removeLast();
        }
    }

    public int top() {
        return stack.getLast();
    }

    public int min() {
        return minStack.getLast();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.min();
        minStack.pop();
        minStack.top();
        minStack.min();
    }
}
