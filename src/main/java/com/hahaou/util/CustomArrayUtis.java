package com.hahaou.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * 数组工具类
 *
 * @author Rike
 */
public abstract class CustomArrayUtis {

    /**
     * 数组转集合
     *
     * @param isLink 是否 LinkedList
     * @param elements
     * @param <T>
     * @return
     */
    public static <T> List<T> toList(boolean isLink, final T... elements) {
        Objects.requireNonNull(elements, "array is null");
        List<T> list = isLink ? new LinkedList<>() : new ArrayList<>(elements.length);
        Collections.addAll(list, elements);
        return list;
    }

    /**
     * 数组转集合
     *
     * 默认返回 LinkedList
     *
     * @param elements
     * @param <T>
     * @return
     */
    public static <T> List<T> toList(final T... elements) {
        Objects.requireNonNull(elements, "array is null");
        return toList(true, elements);
    }
}
