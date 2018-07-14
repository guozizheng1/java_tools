package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest implements Comparator<Student> {
    //实现comparator中的方法
    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        int n = name1.compareTo(name2);
        return n;
    }

    public static void main(String args[]){
        //定义Student类的对象
        Student peter = new Student(40, 20, "peter");
        Student angle = new Student(28, 5, "angle");
        Student tom = new Student(35, 18, "tom");

        //将对象添加到List中
        List<Student> studentList= new ArrayList<Student>();
        studentList.add(peter);
        studentList.add(angle);
        studentList.add(tom);

        //输出排序前的数据
        System.out.println("按名字排序前：");
        for (Student s: studentList){
            System.out.println(s);
        }

        //排序
        Collections.sort(studentList, new StudentTest());

        //输出排序后的数据
        System.out.println("按名字排序后：");
        for (Student s: studentList){
            System.out.println(s);
        }
    }


}
