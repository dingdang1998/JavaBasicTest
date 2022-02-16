package labi.test.base;

import cn.hutool.core.util.StrUtil;

/**
 * @program: JavaBasicTest
 * @description:
 * @author: dzp
 * @create: 2021-12-22 13:34
 **/
public class StrTest {
    public static void main(String[] args) {
        String s = "0,0,0,0,0,0";

        System.out.println(s.equals("1970,01,01,00,00,00") || s.equals("0000,00,00,00,00,00") || s.equals("0,0,0,0,0,0") ? "--" : "xx");

        String s1 = "hhhhhh";
        String s2 = "aaaaaaaaa";
        System.out.println(s1 + "\r\n" + s2);

//        String s3 = null;
//        System.out.println(s3.length());

        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

        String s4 = "";
        System.out.println(StrUtil.isBlankIfStr(s4));
    }
}
