package 队列.队列实现;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zheng
 * @description TODO
 * @date 2020/11/29
 */
public class MyQueue {
    /**
     * 存储元素
     */
    private List<Integer> data;
    /**
     * 头指针
     */
    private int pStart;

    public MyQueue() {
        data = new ArrayList<>();
        pStart = 0;
    }

    /**
     * 入队，返回是否成功
     *
     * @param e
     * @return
     */
    public boolean enQueue(int e) {
        data.add(e);
        return true;
    }

    /**
     * 出对
     *
     * @return
     */
    public boolean deQueue() {
        if (data.isEmpty()) {
            return false;
        }

        pStart++;
        return true;
    }

    public boolean isEmpty() {
        return pStart >= data.size();
    }

    public int front() {
        return data.get(pStart);
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "data=" + data +
                ", pStart=" + pStart +
                '}';
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(1);
        System.out.println(myQueue.front());
    }
}


