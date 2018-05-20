/**
 * 购物车中的商品信息类
 */

package com.imooc.shoppingcart;

public class GoodsInCart {
	private Goods goods;
	private int num;
	
	//构造方法
	public GoodsInCart(Goods goods, int num) {
		this.goods = goods;
		this.num = num;
	}

	public GoodsInCart() {

	}

	//getter和setter方法
	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
