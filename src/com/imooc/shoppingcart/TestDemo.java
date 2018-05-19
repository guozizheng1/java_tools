/**
 * 测试类
 */

package com.imooc.shoppingcart;

import java.util.Scanner;

public class TestDemo {

    public static Scanner sc = new Scanner(System.in);
    static boolean  flag = true;
    static TestDemo td = new TestDemo();

    public void homeMenu(){
        System.out.println("*************************");
        System.out.println("     **主菜单**");
        System.out.println("     1--商品管理");
        System.out.println("     2--购物车");
        System.out.println("     0--退出");
        System.out.println("*************************");
    }

    public void goodsManageMenu(){
        System.out.println("*************************");
        System.out.println("     **商品管理**");
        System.out.println("     1--商品信息导入");
        System.out.println("     2--显示所有商品信息");
        System.out.println("     9--返回上一级菜单");
        System.out.println("*************************");
        //循环输出操作商品管理菜单
        while(flag){
            System.out.println("请输入对应的数字对商品进行管理:");
            int m1 = sc.nextInt();
            switch(m1){
                case 1:
                    break;

                case 2:
                    break;

                case 9:
                    flag = false;
                    td.homeMenu();
                    continue;
            }
        }

    }

    public void goodsInCartMenu(){
        System.out.println("*************************");
        System.out.println("     **购物车管理**");
        System.out.println("     1--添加商品到购物车");
        System.out.println("     2--修改购物车中的商品数量");
        System.out.println("     3--显示购物车中的所有商品信息");
        System.out.println("     4--结算");
        System.out.println("     9--返回上一级菜单");
        System.out.println("*************************");
    }


	//Idea project commit
	public static void main(String[] args) {

        // 循环输出操作主菜单提示
        while(flag){
            td.homeMenu();
            System.out.println("请输入对应数字进行操作:");
            int m = sc.nextInt();
            switch (m){
                case 1:
                    //执行进入商品管理菜单
                    td.goodsManageMenu();
                    break;

                case 2:
                    //执行进入购物车菜单
                    td.goodsInCartMenu();
                    break;

                case 0:
                    //退出程序
                    flag = false;
                    System.out.println("退出程序！");
                    break;

                default:
                    System.out.println("你输入的数据有误！请重新输入");
                    break;

            }
        }



	}

}
