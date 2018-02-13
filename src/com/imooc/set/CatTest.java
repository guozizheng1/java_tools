package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

	public static void main(String[] args) {
		// 定义宠物猫对象
		Cat huahua = new Cat("花花", 12, "英国短毛猫");
		Cat fanfan = new Cat("凡凡", 3, "中华田园猫");
		//将宠物猫对象放入HashSet中
		Set<Cat> set = new HashSet<Cat>();
		set.add(huahua);
		set.add(fanfan);
		//显示宠物猫的信息
		Iterator<Cat> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//再添加一个与花花属性一样的猫
		Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
		set.add(huahua01);
		System.out.println("********************");
		System.out.println("添加重复数据后的宠物猫信息：");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
