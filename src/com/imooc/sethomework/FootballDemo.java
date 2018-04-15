package com.imooc.sethomework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class FootballDemo {
    public static void main(String[] args) {
		//定义HashMap的对象并添加数据
        Map<String, String> team = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<3) {
        	System.out.println("请输入年份year：");
            String year = sc.nextLine();
            System.out.println("请输入冠军champion：");
            String champion = sc.nextLine();
            team.put(year, champion);
            i++;
        }
       
		
		//使用迭代器的方式遍历
        System.out.println("使用迭代器方式输出：");
		Iterator<String> it = team.values().iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
        System.out.println();
        
		//使用EntrySet同时获取key和value
	    System.out.println("使用EntrySet进行输出");
	    Set<Entry<String, String>> entrySet = team.entrySet();
	    for(Entry<String, String> entry:entrySet) {
	    	System.out.print(entry.getKey() + "-");
	    	System.out.println(entry.getValue());
	    }
        
	}
}