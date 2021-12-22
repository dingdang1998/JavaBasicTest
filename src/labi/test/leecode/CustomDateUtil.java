package labi.test.leecode;

import cn.hutool.core.date.DateUtil;

/**
 * @program: JavaBasicTest
 * @description: 日期工具类
 * @author: dzp
 * @create: 2021-12-21 13:56
 **/
public class CustomDateUtil {

    /**
     * 一年中的第几天
     *
     * @param date
     * @return
     */
    public static int dayOfYear(String date) {
        return DateUtil.dayOfYear(DateUtil.parse(date));
    }

}
