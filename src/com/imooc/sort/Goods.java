package com.imooc.sort;

public class Goods implements Comparable<Goods> {

    private String goodsId;//商品编号
    private String goodsName;//商品名称
    private double price;//商品价格


    public Goods() {

    }

    //构造方法
    public Goods(String goodsId, String goodsName, double price) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;

    }


    //getter和setter方法
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "商品信息 [编号=" + goodsId + ", 名称=" + goodsName + ", 价格=" + price + "]";
    }

    @Override
    public int compareTo(Goods o) {

        //取出商品价格
        double price1 = this.getPrice();
        double price2 = o.getPrice();

        int n = new Double(price2-price1).intValue();
        return n;
    }
}
