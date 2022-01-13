package labi.test.base;

/**
 * @program: JavaBasicTest
 * @description: 所有测试在这里面进行
 * @author: dzp
 * @create: 2021-12-15 14:00
 **/
public class Test {

    public static final int a = 1;

    public static void main(String[] args) {
//        SuperClass[] arrays = new SuperClass[]{};
//        System.out.println(arrays.toString());
//
//        List<String> strings = new ArrayList<>();
//
//        String a = "302";
//        System.out.println(a.startsWith("3020"));

        String s = "0000HA2G;高新加油站;0;0;0;0;192.168.1.240;255.255.255.0;192.168.1.1;9500;192.168.17.118;255.255.255.0;192.168.17.1;9500;10;4";
        String[] split = s.split(";");
        for (String s1 : split) {
            System.out.println(s1);
        }
        char[] chars = s.toCharArray();
        System.out.println(chars.length);
    }
}
