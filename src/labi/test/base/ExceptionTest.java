package labi.test.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author labi
 * @version 1.0.0
 * @ClassName ExceptionTest.java
 * @Description TODO
 * @createTime 2022年06月15日 10:57:00
 */
public class ExceptionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.forEach(v-> a());
    }

   public static void a() {
        int i = 1 / 0;
    }
}
