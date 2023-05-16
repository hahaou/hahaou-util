package com.hahaou.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件工具类
 * @author Rike
 */
public abstract class CustomFileUtils {

    /**
     * 删除并重命名
     * @param originalFilePath
     * @param appendFilePath
     * @throws IOException
     */
    public static void deleteAndRename(String originalFilePath, String appendFilePath) throws IOException {
        Files.deleteIfExists(Paths.get(originalFilePath));
        Files.move(Paths.get(appendFilePath), Paths.get(originalFilePath));
    }

    /**
     * 文件不存在创建
     * @param path
     * @throws IOException
     */
    public static void fileNotExistsCreate(String path) throws IOException {
        Path xlsPath = Paths.get(path);
        if (!Files.exists(xlsPath)) {
            Files.createFile(xlsPath);
        }
    }

    /**
     * 如果目录和文件不存在创建
     * @param filePath
     */
    public static void createDirAndFileIfNotExist(String filePath) throws IOException {
        Path parent = Paths.get(filePath).getParent();
        if (Files.notExists(parent)) {
            Files.createDirectories(parent);
        }
        Path path = Paths.get(filePath);
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
    }
}
