/**
 * 测试类
 */

package com.imooc.shoppingcart;

import java.util.Scanner;

public class TestDemo {



    public static void homeMenu(){
        System.out.println("*************************");
        System.out.println("     **主菜单**");
        System.out.println("     1--商品管理");
        System.out.println("     2--购物车");
        System.out.println("     0--退出");
        System.out.println("*************************");
    }

    public static void goodsManageMenu(){
        System.out.println("*************************");
        System.out.println("     **商品管理**");
        System.out.println("     1--商品信息导入");
        System.out.println("     2--显示所有商品信息");
        System.out.println("     9--返回上一级菜单");
        System.out.println("*************************");

    }

    public static void goodsInCartMenu(){
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

        Scanner sc = new Scanner(System.in);
        boolean  flag = true;

        GoodsManage gm = new GoodsManage();
        GoodsInCart gic = new GoodsInCart();

        // 循环输出操作主菜单提示
        while(flag){
            homeMenu();
            System.out.println("请输入对应数字进行操作:");
            int m = sc.nextInt();
            switch (m){
                case 1:
                    //执行进入商品管理菜单
                    goodsManageMenu();
                    boolean b =true;
                    while(b){
                        try{
                            int n = sc.nextInt();
                            switch (n){
                                //商品信息导入
                                case 1:
                                    System.out.println("商品信息导入中...");
                                    gm.importGoods();
                                    System.out.println("信息导入成功！");
                                    goodsManageMenu();
                                    break;
                                //显示所有商品信息
                                case 2:
                                    System.out.println("显示所有商品信息");
                                    System.out.println("所有商品信息为：");
                                    gm.displayAllGoods();
                                    goodsManageMenu();
                                    break;
                                //返回上一级菜单
                                case 9:
                                    b = false;
                                    break;

                                default:
                                    System.out.println("你输入的数据有误！请重新输入");


                            }
                        }catch (Exception e){
                            System.out.println("请输入正确的选项");
                            sc.next();

                        }
                    }break;

                case 2:
                    //执行进入购物车菜单
                    goodsInCartMenu();
                    b = true;
                    while(b){
                        try{
                            int n = sc.nextInt();
                            switch (n){
                                case 1:

                            }
                        }catch (Exception e){

                        }
                    }
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
