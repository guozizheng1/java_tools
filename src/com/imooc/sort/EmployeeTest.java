package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args){

        //定义Employee类的对象
        Employee e1 = new Employee("emp001", "张三", 1800);
        Employee e2 = new Employee("emp002", "李四", 2500);
        Employee e3 = new Employee("emp003", "王五", 1600);

        //将对象添加到List中
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        //输出排序前的数据

        System.out.println("排序前：");
        for (Employee employee: employeeList){
            System.out.println(employee);
        }

        //排序
        Collections.sort(employeeList);

        //输出排序后的数据
        System.out.println("排序后：");
        for (Employee employee: employeeList){
            System.out.println(employee);
        }


    }

}
