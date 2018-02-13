package com.imooc.set;

public class Cat {
	private String name;//名字
	private int month;//年龄
	private String speices;//品种
	
	public Cat() {
		
	}
	public Cat(String name, int month, String speices) {
		super();
		this.name = name;
		this.month = month;
		this.speices = speices;
	}
	//getter与setter方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getSpeices() {
		return speices;
	}
	public void setSpeices(String speices) {
		this.speices = speices;
	}
	@Override
	public String toString() {
		return "[姓名：" + name + ", 年龄：" + month + ", 品种：" + speices + "]";
	}
	
	
	

}
