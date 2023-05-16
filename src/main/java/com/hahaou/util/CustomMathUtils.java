package com.hahaou.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

/**
 * 数学工具类
 *
 * @author Rike
 */
public abstract class CustomMathUtils {

    /**
     * 分转元
     * @param no
     * @return
     */
    public static BigDecimal fen2yuan(int no) {
        BigDecimal fen = new BigDecimal(no);
        BigDecimal yuan = fen.divide(new BigDecimal(100), MathContext.DECIMAL64);
        return yuan;
    }

    /**
     * 元转分
     * @param no
     * @return
     */
    public static int yuan2fen(String no) {
        BigDecimal yuan = new BigDecimal(no);
        BigDecimal fen = yuan.multiply(new BigDecimal(100));
        return fen.intValue();
    }

    /**
     * 将小数指定小数点后几位
     * @param no
     * @param scale
     * @return
     */
    public static BigDecimal exactDecimalPlaces(BigDecimal no, int scale) {
        Objects.requireNonNull(no, "no is null");
        BigDecimal value = no.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return value;
    }
}
