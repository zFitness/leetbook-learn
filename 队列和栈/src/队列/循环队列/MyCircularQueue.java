package 队列.循环队列;

/**
 * @author zheng
 * @description 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 * <p>
 * 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
 * <p>
 * 你的实现应该支持如下操作：
 * <p>
 * MyCircularQueue(k): 构造器，设置队列长度为 k 。
 * Front: 从队首获取元素。如果队列为空，返回 -1 。
 * Rear: 获取队尾元素。如果队列为空，返回 -1 。
 * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
 * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
 * isEmpty(): 检查循环队列是否为空。
 * isFull(): 检查循环队列是否已满。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/queue-stack/kzlb5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2020/11/29
 */
class MyCircularQueue {
    private int head, tail, len;
    private int[] data;

    public MyCircularQueue(int k) {
        len = k;
        data = new int[k];
        head = tail = -1;
    }

    /**
     * 返回队首元素
     *
     * @return
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return data[head];
    }

    /**
     * 返回队尾元素
     *
     * @return
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[tail];
    }

    /**
     * 循环队列插入元素
     *
     * @param k
     * @return
     */
    public boolean enQueue(int k) {
        if (isFull()) {
            return false;
        }
        tail = (tail + 1) % len;
        if (tail != -1) {
            head = 0;
        }
        data[tail] = k;
        return true;
    }

    /**
     * 从循环队列删除队首元素
     *
     * @return
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % len;
        return true;
    }

    public boolean isEmpty() {
        if (head == -1 && tail == -1) {
            return true;
        }
        return head > tail;
    }

    public boolean isFull() {
        if (head == -1 && tail == -1) {
            return false;
        }
        return ((tail + 1) % len) == head;
    }

}


class MyCircularQueueTest {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);

    }
}