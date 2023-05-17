package com.hahaou.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * 日期工具类
 *
 * @author Rike
 * @date 2023/5/17
 */
public abstract class CustomDateUtils {

    /**
     * LocalDateTime 转指定格式日期
     *
     * @param time
     * @param pattern
     * @return
     */
    public static String convert2String(LocalDateTime time, String pattern) {
        Objects.requireNonNull(time, "time must not be null");
        Objects.requireNonNull(pattern, "pattern must not be null");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return time.format(formatter);
    }

    /**
     * LocalDateTime 转毫秒
     *
     * @param time
     * @return
     */
    public static long localDateTime2Milliseconds(LocalDateTime time) {
        Objects.requireNonNull(time, "time must not be null");
        return time.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }
}
