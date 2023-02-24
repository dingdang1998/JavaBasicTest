package labi.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author labi
 * @version 1.0.0
 * @ClassName SQLBuilder.java
 * @Description TODO
 * @createTime 2023年02月13日 19:02:00
 */
public class SQLBuilder {

    List<String> list = new ArrayList<>();

    public void add(String s) {
        list.add(s);
    }

    public String toString(String param) {
        if (list.size() == 0) {
            return "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    stringBuilder.append(list.get(i));
                }else {
                    stringBuilder.append(list.get(i)).append(param);
                }
            }

            return stringBuilder.toString();
        }
    }
}
