package com.hspedu.transformation;

import java.io.*;

/**
 * @author Zhou Yu
 * @version 1.0
 * 演示 OutputStreamWriter 使用
 * 把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理的编码 gbk/utf-8(utf8)
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "src/textFiles/hsp.txt";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi,韩顺平教育");
        osw.close();
        System.out.println("按照 " + charSet + " 创建文件成功~");
    }
}
