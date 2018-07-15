package com.imooc.sort;
//实现Comparable接口
public class Employee implements Comparable<Employee> {
    //成员变量
    private String id;
    private String name;
    private float salary;


    //构造方法

    public Employee(String id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //getter和setter方法

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    //toString()方法

    @Override
    public String toString() {
        return "员工[" +
                "编号：'" + id + '\'' +
                ", 姓名：'" + name + '\'' +
                ", 工资：'" + salary + '\'' +
                ']';
    }

    @Override
    public int compareTo(Employee o) {

        float salary1 = this.getSalary();
        float salary2 = o.getSalary();

        int n = new Float(salary2-salary1).intValue();
        return n;
    }
}
