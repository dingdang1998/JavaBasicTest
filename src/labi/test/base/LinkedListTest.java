package labi.test.base;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        List<String> list = new ArrayList<>(0);
        list.add("b");
        list.add("b");
        list.add("b");

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("a");
        list2.add("a");
        list.addAll(list2);

        System.out.println(list.size());

        String sss = "aaaa,bbbbb";
        String[] split = sss.split(",");
        for (String s:split){
            System.out.println(s);
        }

        BigDecimal bigDecimal = new BigDecimal(1);
        System.out.println(bigDecimal.subtract(null));
    }
}
