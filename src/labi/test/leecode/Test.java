package labi.test.leecode;

import cn.hutool.core.lang.Console;

/**
 * @program: JavaBasicTest
 * @description:
 * @author: dzp
 * @create: 2021-12-21 13:58
 **/
public class Test {
    public static void main(String[] args) {
//        int i = CustomNumUtil.romanToInt("I");
//        System.out.println(i);

//        boolean validParentheses = CustomNumUtil.isValidParentheses("{[}]");
//        System.out.println("有效括号======>" + validParentheses);

//        LinkedList<Integer> l1 = new LinkedList<>();
//        l1.add(1);
//        l1.add(3);
//        l1.add(4);
//        l1.add(7);
//        LinkedList<Integer> l2 = new LinkedList<>();
//        l2.add(2);
//        l2.add(3);
//        l2.add(5);
//        l2.add(6);
//        LinkedList<Integer> l3 = new LinkedList<>();
//        LinkedList<Integer> linkedList = CustomNumUtil.mergeTwoList(l1, l2, l3);
//        System.out.println("合并有序链表======>" + linkedList.toString());

//        int[] nums = {1, 1, 2, 4, 6, 9, 9};
//        int i1 = CustomNumUtil.removeDuplicates(nums);
//        System.out.println("删除数组中的重复元素======>" + i1);

//        int[] nums2 = {1, 1, 2, 4, 6, 9, 9};
//        int i2 = CustomNumUtil.removeElement(nums2, 9);
//        System.out.println("删除与指定元素相同的元素======>" + i2 + "===>" + Arrays.toString(nums2));

//        int i3 = CustomStrUtil.strStr("hello", "ll");
//        System.out.println("在haystack中找出needle第一次出现的位置======>" + i3);

//        int[] nums3 = {1, 1, 2, 4, -6, -9, 9};
//        int i = CustomNumUtil.maxSubArray(nums3);
//        System.out.println("最大子数组之和为======>" + i);

//        String s = "aaaa wow asdal  ";
//        int i = CustomStrUtil.lengthOfLastWord(s);
//        System.out.println("最后一个单词的长度======>" + i);

//        int[] nums3 = {9, 9, 9, 9, 9};
//        int[] ints = CustomNumUtil.plusOne(nums3);
//        System.out.println("加1======>" + Arrays.toString(ints));

//        String a = "11";
//        String b = "10";
//        String s = CustomNumUtil.addBinary(a, b);
//        System.out.println("二进制求和======>" + s);

//        int i = CustomNumUtil.climbStairs(45);
//        System.out.println("爬楼梯======>" + i);

//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("1");
//        linkedList.add("1");
////        linkedList.add("2");
////        linkedList.add("3");
//        LinkedList<String> linkedList1 = CustomNumUtil.deleteDuplicates(linkedList);
//        System.out.println("删除排序链表中的重复元素======>"+linkedList1.toString());

//        int[] num1 = {1, 2, 3, 4, 5};
//        int[] num2 = {2, 6, 7};
//        int[] merge = CustomNumUtil.merge(num1, num1.length, num2, num2.length);
//        Console.log("合并两个有序数组======>" + merge);

        int[] nums = {7, 1, 5, 3, 6, 4};
        int maxProfit = CustomNumUtil.maxProfit(nums);
        Console.log("买卖股票的最佳时机======>" + maxProfit);

        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = CustomStrUtil.isPalindrome(s);
        Console.log("验证回文串======>" + palindrome);

        int[] nums2 = {2, 2, 3};
        int i = CustomNumUtil.singleNumber(nums2);
        Console.log("只出现一次的数字======>" + i);
    }
}
