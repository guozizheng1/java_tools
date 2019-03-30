package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args){

        //创建一个File类的对象
        //File file1 = new File("E:\\imooc\\io\\score.txt");
        //File file1 = new File("E:\\imooc","io\\score.txt");
        File file = new File("E:\\imooc");
        File file1 = new File(file,"\\io\\score.txt");
        //判断是文件还是目录
        System.out.println("是否是目录：" + file1.isDirectory());
        System.out.println("是否是文件：" + file1.isFile());

        //创建目录
        File file2 = new File("E:\\imooc\\set\\HashSet");
        if(!file2.exists()){
            file2.mkdirs();
        }

        System.out.println(file2.getPath());
        //创建文件
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(file1.getPath());



    }
}
