package labi.test.leecode;

import cn.hutool.core.collection.CollUtil;

import java.util.*;

/**
 * @program: JavaBasicTest
 * @description: 数字工具类
 * @author: dzp
 * @create: 2021-12-21 14:28
 **/
public class CustomNumUtil {

    /**
     * 两数之和
     * leetcode1
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 是不是回文数
     * leetcode9
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertNumber = 0;
        while (x > revertNumber) {
            revertNumber = revertNumber * 10 + x % 10;
            x = x / 10;
        }

        //     偶数                   奇数
        return x == revertNumber || x == revertNumber / 10;
    }


    static Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * 罗马数转int
     * leetcode13
     *
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }

        return ans;
    }

    /**
     * 有效括号
     * leetcode20
     *
     * @param s
     * @return
     */
    public static boolean isValidParentheses(String s) {
        //奇数长度的字符串直接返回
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(c))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    /**
     * 合并两个有序链表
     * 用递归
     * leetcode21
     *
     * @param l1
     * @param l2
     * @return
     */
    public static LinkedList<Integer> mergeTwoList(LinkedList<Integer> l1, LinkedList<Integer> l2, LinkedList<Integer> l3) {
        if (l1 == null || l1.size() == 0) {
            l3.addAll(l2);
            return l3;
        } else if (l2 == null || l2.size() == 0) {
            l3.addAll(l1);
            return l3;
        } else if (l1.getFirst() < l2.getFirst()) {
            l3.add(l1.pollFirst());
            return mergeTwoList(l1, l2, l3);
        } else {
            l3.add(l2.pollFirst());
            return mergeTwoList(l1, l2, l3);
        }
    }

    /**
     * 删除有序数组的重复项
     * leetcode26
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return n;
        }

        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            fast++;
        }

        return slow;
    }

    /**
     * 移除元素
     * leercode27
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;

        if (n == 0) {
            return n;
        }

        int fast = 0, slow = 0;
        while (fast < n) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                ++slow;
            }
            fast++;
        }

        return slow;
    }

    /**
     * 搜索插入位置
     * leetcode35
     * 二分查找法
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            // >> 1 的本质就是 /2
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    /**
     * 最大子数组和
     * leetcode53
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    /**
     * 加1
     * leetcode66
     *
     * @param nums
     * @return
     */
    public static int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i]++;
            nums[i] = nums[i] % 10;
            if (nums[i] != 0) {
                return nums;
            }
        }

        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }

    /**
     * 二进制求和
     * leetcode67
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    /**
     * 爬楼梯
     * leetcode70
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    /**
     * 删除排序链表中的重复元素
     * leetcode83
     *
     * @param linkedList
     * @return
     */
    public static LinkedList<String> deleteDuplicates(LinkedList<String> linkedList) {
        if (CollUtil.isEmpty(linkedList)) {
            return linkedList;
        }

        if (linkedList.size() == 1) {
            return linkedList;
        }

        HashSet<String> set = new HashSet<>();
        ListIterator<String> iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            String next = iterator.next();

            if (set.contains(next)) {
                iterator.remove();
            } else {
                set.add(next);
            }
        }

        return linkedList;
    }

    /**
     * 合并两个有序数组
     * leetcode88
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sort = new int[m + n];

        int cur = 0;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sort[p1 + p2 - 1] = cur;
        }

        return sort;
    }

    /**
     * 买卖股票的最佳时机
     * leetcode121
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxPrice) {
                maxPrice = prices[i] - minPrice;
            }
        }
        return maxPrice;
    }

    /**
     * 只出现一次的数字
     * 使用异或解决
     * leetcode136
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }
}
