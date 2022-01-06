package labi.test.leecode;

/**
 * @program: JavaBasicTest
 * @description:
 * @author: dzp
 * @create: 2021-12-22 11:10
 **/
public class CustomStrUtil {

    /**
     * 在haystack中找出needle第一次出现的位置
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * 最后一个单词的长度
     * leetcode58
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }

    /**
     * 验证回文串
     * leetcode125
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        StringBuilder sGood = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sGood.append(Character.toLowerCase(c));
            }
        }

        StringBuilder reverse = new StringBuilder(sGood).reverse();
        return sGood.toString().equals(reverse.toString());
    }
}
