package labi.test.base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: JavaBasicTest
 * @description:
 * @author: dzp
 * @create: 2022-02-16 13:55
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        System.out.println(map.get(null));
        System.out.println(map.isEmpty());

        Set<String> set = null;
//        System.out.println(set.isEmpty());

        Map<String, String> map1 = new HashMap<>();
        map1.put("1","Y");
        map1.put("2","N");
        System.out.println(map1.get(null));
    }
}
