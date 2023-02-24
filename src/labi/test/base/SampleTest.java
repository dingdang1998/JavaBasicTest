package labi.test.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author labi
 * @version 1.0.0
 * @ClassName SampleTest.java
 * @Description TODO
 * @createTime 2022年06月14日 14:14:00
 */
public class SampleTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse("2022-04-10 00:00:00");
        System.out.println(parse);

        List<String> list = new ArrayList<>();
        System.out.println(list.toString());
    }
}
