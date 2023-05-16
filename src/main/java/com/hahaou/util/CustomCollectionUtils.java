package com.hahaou.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Objects;

/**
 * 工具工具类
 *
 * @author Rike
 */
public abstract class CustomCollectionUtils {

    /**
     * 数组转集合
     *
     * @param collection
     * @param componentType
     * @param <T>
     * @return
     */
    public static <T> T[] toArray(Collection<T> collection, Class<T> componentType) {
        Objects.requireNonNull(collection, "array is null");
        Objects.requireNonNull(componentType, "componentType is null");
        return collection.toArray(newArray(componentType, 0));
    }

    /**
     * 创建指定类型的数组
     *
     * @param componentType
     * @param newSize
     * @param <T>
     * @return
     */
    public static <T> T[] newArray(Class<?> componentType, int newSize) {
        Objects.requireNonNull(componentType, "componentType is null");
        return (T[]) Array.newInstance(componentType, newSize);
    }
}
