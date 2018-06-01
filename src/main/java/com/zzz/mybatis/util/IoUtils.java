package com.zzz.mybatis.util;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

/**
 * <p>
 * <p>
 * io 关闭
 * </p>
 *
 * @author tao.zeng.
 * @since 2018/1/17.
 */
public final class IoUtils {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IoUtils.class);

    private IoUtils() {
    }

    /**
     * 关闭io
     *
     * @param closeables io 对象 stream、Closeable
     */
    public static void close(Closeable... closeables) {
        if (closeables != null) {
            try {
                for (Closeable io : closeables) {
                    if (io != null) {
                        io.close();
                    }
                }
            } catch (IOException e) {
                log.error("io 关闭异常：{}", e);
            }
        }
    }


    /**
     * 保存文件 不追加内容
     *
     * @param filePath 文件路径
     * @param content  文本内容
     */
    public static void saveFile(String filePath, String content) {
        saveFile(filePath, content, false);
    }

    /**
     * 保存文件
     *
     * @param filePath 文件路径
     * @param content  文本内容
     * @param append   是否追加
     */
    public static void saveFile(String filePath, String content, boolean append) {
        if (StringUtils.isEmpty(content)) {
            return;
        }
        FileWriter fileWriter = null;
        BufferedWriter writer = null;
        try {
            fileWriter = new FileWriter(filePath, append);
            writer = new BufferedWriter(fileWriter);
            writer.write(content);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(writer, fileWriter);
        }
    }

    /**
     * 读取文本文件
     *
     * @param filePath 文本文件路径
     * @return 文件内容
     */
    public static String readFile(String filePath) {
        if (StringUtils.isEmpty(filePath)) {
            return null;
        }
        FileReader fileReader = null;
        BufferedReader reader = null;
        StringBuilder builder = new StringBuilder();
        try {
            fileReader = new FileReader(filePath);
            reader = new BufferedReader(fileReader);
            String line;
            while (StringUtils.isNotEmpty(line = reader.readLine())) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader, fileReader);
        }
        return builder.toString();
    }

    /**
     * 复制文件
     *
     * @param fromPath 原始文件路径
     * @param toPath   目标文件路径
     */
    public static void copyFile(String fromPath, String toPath) {
        FileInputStream fileInputStream = null;
        BufferedInputStream inputStream = null;

        FileOutputStream fileOutputStream = null;
        BufferedOutputStream outputStream = null;

        try {
            fileInputStream = new FileInputStream(fromPath);
            inputStream = new BufferedInputStream(fileInputStream);

            fileOutputStream = new FileOutputStream(toPath);
            outputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bs = new byte[1024];
            int len;
            while ((len = inputStream.read(bs)) != -1) {
                outputStream.write(bs, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(outputStream, fileOutputStream, inputStream, fileInputStream);
        }
    }

    /**
     * 复制文件
     *
     * @param fromFile 原始文件
     * @param toFile   目标文件
     */
    public static void copyFile(File fromFile, File toFile) {
        copyFile(fromFile.getAbsolutePath(), toFile.getAbsolutePath());
    }
}
