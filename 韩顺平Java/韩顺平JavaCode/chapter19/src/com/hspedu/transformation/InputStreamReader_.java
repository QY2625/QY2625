package com.hspedu.transformation;

import java.io.*;

/**
 * @author Zhou Yu
 * @version 1.0
 * 演示使用InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream -> 转成字符流 InputStreamReader,指定编码 gbk/utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "src/textFiles/note.txt";
        //解读
        //1. FileInputStream 转成 InputStreamReader
//      //2. 指定编码 gbk
//      InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");
//      //3. 把 InputStreamReader 传入 BufferedReader
//      BufferedReader br = new BufferedReader(isr);

        //将2 和 3 合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));


        //4. 读取
        String s = br.readLine();
        System.out.println("读取内容=" + s);
        //5. 关闭外层流
        br.close();
    }
}
