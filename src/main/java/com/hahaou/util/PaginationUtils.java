package com.hahaou.util;

/**
 * 分页工具类
 *
 * @author Rike
 */
public abstract class PaginationUtils {

    // 批次大小
    public static final int BATCH_SIZE_DEFAULT = 1000;

    /**
     * 计算循环总数
     * @param count
     * @return
     */
    public static int calcPageTotal(int count, int pageSize) {
        int cycleNo = 0;
        // 集合大小是批量执行大小的整数倍，集合大小/批量执行大小
        if (count % pageSize == 0) {
            cycleNo = count / pageSize;
        } else {// 集合大小不是批量执行大小的整数倍，集合大小/批量执行大小+1
            cycleNo = count / pageSize + 1;
        }
        return cycleNo;
    }
}
