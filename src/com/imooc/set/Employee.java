package com.imooc.set;

public class Employee{
	 //根据需求完成Employee类的定义  
	    private int id; //编号
	    private String name;//姓名
	    private double salary;//薪资
	    
	    public Employee(){
	        
	    }
	    
	    public Employee(int id, String name, double salary){
	        super();
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        
	    }
	    
	    public int getId(){
	        return id;
	    }
	    
	    public void setId(int id){
	        this.id = id;
	    }
	    
	    public String getName(){
	        return name;
	    }
	    
	    public void setName(String name){
	        this.name = name;
	    }
	    
	    public double getSalary(){
	        return salary;
	    }
	    
	    public void setSalary(double salary){
	        this.salary = salary;
	    }
	 
	}
