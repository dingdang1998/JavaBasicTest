package labi.test.base;

import java.math.BigDecimal;

/**
 * @author labi
 * @version 1.0.0
 * @ClassName BigDecimalTest.java
 * @Description TODO
 * @createTime 2022年06月13日 10:37:00
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal zero = new BigDecimal("01.033333");
        System.out.println(zero.stripTrailingZeros().scale());
    }
}
