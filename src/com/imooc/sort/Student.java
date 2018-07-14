package com.imooc.sort;

public class Student {
    //成员变量
    private int stuNo;

    private int age;

    private String name;

    //构造方法
    public Student(int stuNo, int age, String name) {
        this.stuNo = stuNo;
        this.age = age;
        this.name = name;
    }

    //getter setter 方法


    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "{" +
                "学号：" + stuNo +
                ", 姓名：" + name + '\'' +
                ", 年龄：" + age +
                '}';
    }
}
