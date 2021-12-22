package labi.test.base;

import java.util.LinkedList;

/**
 * @program: JavaBasicTest
 * @description:
 * @author: dzp
 * @create: 2021-12-22 09:44
 **/
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.pollFirst();
        System.out.println(linkedList.toString());
    }
}
