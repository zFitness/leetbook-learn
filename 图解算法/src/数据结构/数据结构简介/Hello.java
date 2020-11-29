package 数据结构.数据结构简介;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;


/**
 * @author zheng
 * @description TODO
 * @date 2020/11/5
 */
public class Hello {
    public static void main(String[] args) {

    }

    @Test
    public void testLinkedList() {
        LinkedList<Integer> stack = new LinkedList<>();
        //入栈
        stack.addLast(1);
        System.out.println(stack);
        stack.add(2);
        System.out.println(stack);
        //出栈
        stack.removeLast();
        System.out.println(stack);
    }

    @Test
    public void testStackList() {
        Stack<Integer> stack = new Stack<>();
        //入栈
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        //出栈
        stack.pop();
        System.out.println(stack);
    }

    @Test
    public void queueTest() {
        Queue<Integer> queue = new LinkedList<>();
        //入队
        queue.offer(1);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        //出队
        queue.poll();
        System.out.println(queue);

    }

    /**
     * 堆
     */
    @Test
    public void heapTest() {
        //初始化小顶堆
        Queue<Integer> heap = new PriorityQueue<>();

        //元素入堆
        heap.add(1);
        System.out.println(heap);
        heap.add(2);
        System.out.println(heap);
        heap.add(3);
        System.out.println(heap);
        heap.add(3);
        System.out.println(heap);

        //元素出堆
        heap.poll();
        System.out.println(heap);
        heap.poll();
        System.out.println(heap);
        heap.poll();
        System.out.println(heap);
        heap.poll();
        System.out.println(heap);
    }
}
