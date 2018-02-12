package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeTest {

	public static void main(String[] args) {
		// 创建Notice类型的对象，生成三条公告
		Notice notice1 = new Notice(1, "欢迎来到慕课网！", "管理员", new Date());
		Notice notice2 = new Notice(2, "请同学们按时交作业！", "老师", new Date());
		Notice notice3 = new Notice(3, "考勤通知！", "老师", new Date());

		// 添加公告
		List<Notice> noticelist = new ArrayList<Notice>();
		noticelist.add(notice1);
		noticelist.add(notice2);
		noticelist.add(notice3);

		// 显示公告
		System.out.println("公告的内容为：");
		for (int i = 0; i < noticelist.size(); i++) {
			System.out.println((i + 1) + ":" + ((Notice) noticelist.get(i)).getTitle());
		}

		System.out.println("***********************");

		// 在第一条公告后面添加一条新公告
		Notice notice4 = new Notice(4, "在线编辑器可以使用啦！", "管理员", new Date());
		noticelist.add(1, notice4);
		// 显示公告
		System.out.println("公告的内容为：");
		for (int i = 0; i < noticelist.size(); i++) {
			System.out.println((i + 1) + ":" + ((Notice) noticelist.get(i)).getTitle());
		}

		System.out.println("***********************");

		// 删除按时完成作业的公告
		noticelist.remove(2);
		// 显示公告
		System.out.println("删除公告后的内容为：");
		for (int i = 0; i < noticelist.size(); i++) {
			System.out.println((i + 1) + ":" + ((Notice) noticelist.get(i)).getTitle());
		}

		// 将第二条公告改为：Java在线编辑器可以使用啦！
		System.out.println("***********************");
		// 修改第二条公告中的值
		notice4.setTitle("Java在线编辑器可以使用啦！");
		noticelist.set(1, notice4);
		// 显示公告
		System.out.println("修改公告后的内容为：");
		for (int i = 0; i < noticelist.size(); i++) {
			System.out.println((i + 1) + ":" + ((Notice) noticelist.get(i)).getTitle());
		}

	}

}
