package com.imooc.set;
import java.util.List;
import java.util.ArrayList;
public class EmployeeTest {
    public static void main(String[] args) {
		//定义ArrayList对象
        List<Employee> empList = new ArrayList<Employee>();
        //创建三个Employee类的对象
        Employee emp1 = new Employee(1, "张三", 5000.0);
        Employee emp2 = new Employee(2, "李四", 5500.0);
        Employee emp3 = new Employee(3, "赵六", 4000.0);
        //添加员工信息到ArrayList中
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        
        //显示员工的姓名和薪资
        System.out.println("员工姓名" + "\t" + "员工薪资");
        for(int i = 0; i<empList.size(); i++){
            System.out.println(empList.get(i).getName() + "\t" + empList.get(i).getSalary());
        }
	}
}
