package 数据结构.替换空格;

/**
 * @author zheng
 * @description 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @date 2020/11/5
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
        System.out.println(replaceSpace1("We are happy."));
        System.out.println(replaceSpace2("We are happy."));
        System.out.println(replaceSpace3("We are happy."));
    }

    /**
     * 正则
     *
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        return s.replaceAll("\\s", "%20");
    }

    /**
     * StringBuilder
     * 时间复杂度：O(N)
     * 空间复杂度: O(N)
     * @param s
     * @return
     */
    public static String replaceSpace1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * StringBuffer
     * 时间复杂度：O(N)
     * 空间复杂度: O(N)
     * @param s
     * @return
     */
    public static String replaceSpace2(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * 字符串数组
     *
     * @param s
     * @return
     */
    public static String replaceSpace3(String s) {
        char[] str = new char[s.length() * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str[size++] = '%';
                str[size++] = '2';
                str[size++] = '0';
            } else {
                str[size++] = s.charAt(i);
            }
        }
        return new String(str, 0, size);
    }
}
