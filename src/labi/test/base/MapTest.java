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

        Set<String> set = new HashSet<>();

    }
}
