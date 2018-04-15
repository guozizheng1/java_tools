package com.imooc.sethomework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		//定义三个Student类的对象及一个HashSet类的对象
        Student stu1 = new Student(1, "Tom", 87.0);
        Student stu2 = new Student(2, "Lucy", 95.0);
        Student stu3 = new Student(3, "William", 65.0);
        
        Set<Student> set = new HashSet<Student>();
		//将Student类的对象添加到集合中
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        
		//使用迭代器显示Student类的对象中的内容
        Iterator<Student> it = set.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        //在插入一个与tom属性一样的学生信息
        Student stu4 = new Student(1, "Tom", 87.0);
        set.add(stu4);
        System.out.println("********************");
        System.out.println("添加重复信息后的学生信息：");
       //使用迭代器显示Student类的对象中的内容
        it = set.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }

	}

}
