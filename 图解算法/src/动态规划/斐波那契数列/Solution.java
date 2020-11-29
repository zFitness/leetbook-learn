package 动态规划.斐波那契数列;

/**
 * @author zheng
 * @description 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：5
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/50fxu1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2020/11/28
 */
public class Solution {
    private static final int[] TEMP = new int[101];

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(2) % 1000000007);
        System.out.println(solution.fib(5));
    }

    /**
     * 记忆化递归法：
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        return fibC(n) % 1000000007;
    }

    public int fibC(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if (TEMP[n] == 0) {
                TEMP[n] = fib(n - 1) + fib(n - 2);
            }
            return TEMP[n];
        }
    }

}
