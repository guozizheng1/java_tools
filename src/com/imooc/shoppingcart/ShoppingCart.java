/**
 * 购物车类
 */

package com.imooc.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	Map<String, GoodsInCart> shoppingCart = new HashMap<String, GoodsInCart>();
	
	//构造方法
	public ShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
		
	}

	//getter和setter方法
	public Map<String, GoodsInCart> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	//添加商品到购物车
	public void addGoodsToCart(GoodsManage gm) {
		
	}
	
	//修改购物车的商品数量
	public void updateNumInCart() {
		
	}
	
	//显示购物车中的所有商品
	public void displayAllInCart() {
		
	}
	
	//结算
	public void settleAccounts() {
		
	}
	
	
	

}
