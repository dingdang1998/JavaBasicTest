package labi.test.base;

import labi.test.Caculator;

/**
 * @program: JavaBasicTest
 * @description: 所有测试在这里面进行
 * @author: dzp
 * @create: 2021-12-15 14:00
 **/
public class Test {


    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        System.out.println(caculator.count(1, 2));
    }
}
