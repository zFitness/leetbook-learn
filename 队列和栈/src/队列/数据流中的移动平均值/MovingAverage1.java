package 队列.数据流中的移动平均值;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zheng
 * @description 给定一个整数数据流和一个窗口大小，根据该滑动窗口的大小，计算其所有整数的移动平均值。
 * 示例:
 * <p>
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/queue-stack/k1msc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2020/12/3
 */
public class MovingAverage {
    private int size;
    LinkedList<Integer> q = new LinkedList<>();

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        q.add(val);
        int windowSum = 0;
        for (int i = Math.max(0, q.size() - size); i < q.size(); i++) {
            windowSum += q.get(i);
        }
        return (windowSum * 1.0) / Math.min(size, q.size());
    }
}
