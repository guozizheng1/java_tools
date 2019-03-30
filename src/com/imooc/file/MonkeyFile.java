package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class MonkeyFile {

    public static void main(String args[]){
        File f1 = new File("E:\\imooc\\File");
        File f2 = new File(f1,"\\Monday.docx");

        if(!f1.exists()){
            f1.mkdirs();
        }

        if(!f2.exists()){
            try {
                f2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("创建文件成功！");
        System.out.println("文件名称：" + f2.getName());
        System.out.println("文件上一级目录名称：" + f1.getName());
       if(f2.isFile()){
           System.out.println("文件/目录：这是一个文件");
       }
       if(f2.canRead()&&f2.canWrite()){
           System.out.println("读写性：这个文件即可读又可写");
       }
    }
}
