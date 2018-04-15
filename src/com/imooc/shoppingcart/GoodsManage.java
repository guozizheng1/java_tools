/**
 * 商品管理类
 */

package com.imooc.shoppingcart;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
	Set<Goods> goodsSet = new HashSet<Goods>();
	
	//构造方法
	public GoodsManage(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}

	//getter和setter方法
	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}

	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}
	
	//商品信息导入方法
	public void importGoods() {
		Goods g1 = new Goods("goods001", "水杯", 56.0, "不锈钢水杯");
		Goods g2 = new Goods("goods002", "饮水机", 299.0, "带净化功能的饮水机");
		Goods g3 = new Goods("goods003", "笔记本电脑", 4999.0, "15寸笔记本电脑");
		Goods g4 = new Goods("goods004", "手机", 2300.0, "android手机");
		//将商品信息导入
		goodsSet.add(g1);
		goodsSet.add(g2);
		goodsSet.add(g3);
		goodsSet.add(g4);
		
	}
	
	//显示所有商品信息方法
	public void displayAllGoods() {
		Iterator<Goods> it = goodsSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	

}
