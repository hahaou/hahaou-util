package com.hahaou.util;

import java.util.Map;
import java.util.Objects;

/**
 * map 工具类
 * @author Rike
 */
public abstract class CustomMapUtils {

    /**
     * 判断指定的map中是否包含指定的key
     * @param map
     * @param key
     * @return
     */
    public static boolean containsKey(final Map<?,?> map, final Object key) {
        Objects.requireNonNull(map, "Map must not be null");
        boolean flag = false;
        if (map.containsKey(key)) {
            flag = true;
        }
        return flag;
    }
}
